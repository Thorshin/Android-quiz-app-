package com.example.lab11_boufangha_yahya;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class Register extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText etMail, etPassword, etPassword1;
    Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        etMail      = findViewById(R.id.etMail);
        etPassword  = findViewById(R.id.etPassword);
        etPassword1 = findViewById(R.id.etPassword1);
        bRegister   = findViewById(R.id.bRegister);

        bRegister.setOnClickListener(v -> {
            String mail      = etMail.getText().toString().trim();
            String password  = etPassword.getText().toString().trim();
            String password1 = etPassword1.getText().toString().trim();

            if (TextUtils.isEmpty(mail) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Please fill in the required fields", Toast.LENGTH_SHORT).show();
                return;
            }
            if (password.length() < 6) {
                Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!password.equals(password1)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            mAuth.createUserWithEmailAndPassword(mail, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Register.this,
                                        "Registration successful!", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(Register.this, Login.class));
                                finish();
                            } else {
                                Toast.makeText(Register.this,
                                        "Registration failed: " + task.getException().getMessage(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        });
    }
}
