<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=blur&color=0:1e3c72,100:2a5298&height=220&section=header&text=🪔%20Krishna-Verse%20🦚&fontSize=42&fontColor=FFD700&animation=twinkling&fontAlignY=35&desc=Divine%20Guidance%20Through%20Bhagavad%20Gita&descAlignY=60&descSize=16" />
</p>

<p align="center">
  🪔 A Gita-Based AI-Inspired Chatbot for Emotional Guidance
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-2.0-purple?logo=kotlin" />
  <img src="https://img.shields.io/badge/Jetpack%20Compose-UI-blue?logo=android" />
  <img src="https://img.shields.io/badge/Architecture-MVVM-success" />
  <img src="https://img.shields.io/badge/Platform-Android-green?logo=android" />
  <img src="https://img.shields.io/badge/Offline-Enabled-orange" />
  <img src="https://img.shields.io/badge/Firebase-Integrated-yellow" />
  <img src="https://img.shields.io/badge/Status-Production%20Ready-brightgreen" />
</p>

---

## 🌿 About the Project

**Krishna-Verse** is a modern Android chatbot application built using **Kotlin & Jetpack Compose** that provides emotional and spiritual guidance based on the teachings of the **Bhagavad Gita**.

The app combines a **rule-based intelligent response system** with a **ChatGPT-like conversational UI**, delivering meaningful, explainable, and emotionally aware responses.

It is designed to work **fully offline** while also being **scalable for real AI integration (Gemini/OpenAI)**.

---

## ✨ Features

- 💬 Chat-style conversational UI (ChatGPT-like experience)  
- 📜 Bhagavad Gita verses with simplified explanations  
- 🧠 Emotion-based response system  
- 🎯 Weighted intent keyword matching algorithm  
- 🔁 Session memory to avoid repetition  
- 📱 Fully offline chatbot system  
- 🔐 Firebase Authentication (Email + Google Sign-In)  
- 🗂️ User-specific chat history (Room Database)  
- ✏️ Chat management (Rename, Delete, Pin)  
- 🖼️ Profile image upload with crop (Firebase Storage)  
- 🎨 Premium UI (Glassmorphism + Gradients)  
- 🌙 Custom Dark/Light theme toggle  

---

## 🧠 How It Works

1️⃣ User enters a message or emotional query  
2️⃣ Input is cleaned and processed  
3️⃣ Emotion is detected using a lightweight analyzer  
4️⃣ Intent keywords are matched with verse tags  
5️⃣ Verses are scored using weighted logic  
6️⃣ Top candidates are filtered and ranked  
7️⃣ A relevant Krishna-style response is generated  

---

## 🏗️ System Architecture

Krishna-Verse
│
├── 📦 data
│   ├── auth/
│   │   └── FirebaseAuthManager.kt
│   │
│   ├── local/
│   │   ├── AppDatabase.kt
│   │   └── ChatDao.kt
│   │
│   └── model/
│       ├── AuthState.kt
│       ├── ChatEntity.kt
│       ├── ChatItem.kt
│       └── GitaVerse.kt
│
├── 📦 repository
│   └── GitaRepository.kt
│
├── 📦 ui
│   ├── components/
│   │   ├── AppBackground.kt
│   │   └── DrawerItemWithIcon.kt
│   │
│   ├── navigation/
│   │   └── AppNavigation.kt
│   │
│   └── screens/
│       └── ChatScreen.kt
│
├── 📦 util
│   ├── AnimatedMessage.kt
│   ├── FakeEmotionDetector.kt
│   ├── JsonLoader.kt
│   ├── MessageBubble.kt
│   ├── MessageInput.kt
│   └── GitaVerse.kt
│
└── MainActivity.kt

---

## 🔄 Application Flow

flowchart TD
    A[User Input] --> B[Chat UI (Compose)]
    B --> C[ChatViewModel]
    C --> D[Emotion Analyzer]
    C --> E[Keyword Processing]

    D --> F[Detected Emotion]
    E --> G[Intent Matching]

    F --> H[GitaRepository]
    G --> H

    H --> I[Score & Rank Verses]
    I --> J[Select Best Match]

    J --> K[Generate Krishna Response]
    K --> L[Update Chat State]

    L --> M[Display in UI]

    C --> N[Room Database]
    N --> O[Save Chat History]

    subgraph Firebase
        P[Authentication]
        Q[Profile Image Storage]
    end

    C --> P
    C --> Q

---

## 🏛️ Architecture

The app follows **MVVM Architecture**:

- 🎨 UI Layer → Jetpack Compose  
- 🧠 ViewModel Layer → State & business logic  
- 📂 Repository Layer → Data & response handling  
- 💾 Local Layer → Room Database  
- ☁️ Services → Firebase Authentication & Storage  

✔ Clean architecture  
✔ Scalable for AI integration  
✔ Maintainable and modular codebase  

---

## ⚙️ Tech Stack

- 🟣 Kotlin (2.0)  
- 🎨 Jetpack Compose (Material 3)  
- 🏗️ MVVM Architecture  
- 🗂️ Room Database  
- 🔐 Firebase Authentication  
- ☁️ Firebase Storage  
- 🌐 Retrofit + OkHttp  
- 📂 Local JSON Dataset  
- 🧠 Rule-Based NLP System  
- 🔄 Coroutines  

---

## 🎯 Accuracy Methodology

- 🏷️ Manual semantic tagging of verses  
- ⚖️ Weighted keyword scoring system  
- ➕ Context bonus for multi-keyword matches  
- 😊 Emotion-aware filtering  
- 🔁 Session memory to prevent repetition  

---

## 📌 Limitations

- Rule-based system (not full NLP yet)  
- Limited understanding of complex language  
- Depends on dataset coverage  

---

## 🔮 Future Scope

- 🤖 Gemini / OpenAI API integration  
- ☁️ Firestore chat sync  
- 🧠 ML-based emotion detection (TensorFlow Lite)  
- 🌍 Multi-language support  
- 🎙️ Voice-based interaction  

---

## 👨‍💻 Developer

Built with dedication to merge modern technology with timeless spiritual wisdom.

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:8B0000,100:FF9933&height=120&section=footer"/>
</p>
