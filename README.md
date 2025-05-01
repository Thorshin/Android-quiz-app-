# History Quiz App

An Android-based history quiz application featuring:

- **Dynamic, Firebase-backed questions** for core quizzes (Quiz 1–5).  
- **AI-generated bonus quiz** via a lightweight Python/Flask + Claude API backend.  
- **Animated backgrounds & transitions** (Lottie scrolls, GIFs, “page-curl”).  
- **Score tracking** across activities with a themed, vertical progress bar.

---

## ⚙️ Features

- **Firebase Realtime Database** for core quiz content  
- **Anthropic Claude API** backend for AI-generated bonus questions  
- **Custom themes**: ancient-style fonts, parchment backgrounds, radio/button styling  
- **Smooth animations**: Lottie scroll, GIF backgrounds, page-curl transitions  
- **Persistent scoring** across multiple quiz activities  

---

## 🚀 Technologies

- **Android SDK** in Java  
- **Firebase Realtime Database**  
- **Lottie** (scroll animation)  
- **android-gif-drawable** for GIF backgrounds  
- **OkHttp** (or Retrofit) for backend calls  
- **Python + Flask** backend for AI question generation  
- **Anthropic Claude API** for dynamic question creation  

---

## 🔧 Getting Started

### Prerequisites

- Android Studio (Arctic Fox or later)  
- Java 11  
- An Android device or emulator running API ≥ 24  
- A Firebase project (add your own `google-services.json`)  
- A deployed Flask backend URL (for AI bonus quiz)

### Setup

1. **Clone the repo**  
   ```bash
   git clone https://github.com/Thorshin/Android-quiz-app
   cd Android-quiz-app
