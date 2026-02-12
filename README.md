<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:FF9933,100:8B0000&height=200&section=header&text=Krishna-Verse&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" />
</p>

<p align="center">
  🪔 A Gita-Based AI-Inspired Chatbot for Emotional Guidance
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.9-purple?logo=kotlin" />
  <img src="https://img.shields.io/badge/Jetpack%20Compose-UI-blue?logo=android" />
  <img src="https://img.shields.io/badge/Architecture-MVVM-success" />
  <img src="https://img.shields.io/badge/Platform-Android-green?logo=android" />
  <img src="https://img.shields.io/badge/Offline-Enabled-orange" />
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen" />
</p>

---

## 🌿 About the Project

**Krishna-Verse** is an Android chatbot application built using **Kotlin & Jetpack Compose** that provides emotional and spiritual guidance based on the teachings of the **Bhagavad Gita**.

Instead of using heavy ML models, this app uses a **rule-based intent matching system** with manually tagged verses to deliver relevant, explainable, and compassionate responses.

---

## ✨ Features

- 💬 Chat-style conversational UI  
- 📜 Curated Bhagavad Gita verses with emotional explanations  
- 🏷️ Manual emotional tagging for improved accuracy  
- 🎯 Weighted intent keyword matching  
- 🧠 Context-aware scoring system  
- 🔁 Session memory to avoid repetition  
- 📱 Fully offline – No API required  
- 🌙 Material 3 UI with dark mode support  

---

## 🧠 How It Works

1️⃣ User enters a question or emotional concern  
2️⃣ Input is cleaned and analyzed  
3️⃣ Intent keywords are detected  
4️⃣ Verses are scored using weighted logic  
5️⃣ Top matches are shortlisted  
6️⃣ Krishna-style guidance is displayed  

---

## 🏗️ System Architecture

```
Krishna-Verse
│
├── 📦 data
│   ├── GitaRepository.kt
│   ├── GitaVerse.kt
│   └── gita_chatbot.json
│
├── 📦 viewmodel
│   └── ChatViewModel.kt
│
├── 📦 ui
│   ├── ChatScreen.kt
│   ├── MessageInput.kt
│   ├── UserBubble.kt
│   └── KrishnaBubble.kt
│
├── MainActivity.kt
│
└── assets/
    └── gita_chatbot.json
```

---

## 🏛️ Architecture

The app follows **MVVM Architecture**:

- 🎨 UI Layer → Jetpack Compose  
- 🧠 ViewModel Layer → State & logic handling  
- 📂 Repository Layer → Data processing  
- 📜 JSON Dataset → Tagged Bhagavad Gita verses  

✔ Clean separation of concerns  
✔ Scalable structure  
✔ Maintainable codebase  

---

## ⚙️ Tech Stack

- 🟣 Kotlin  
- 🎨 Jetpack Compose  
- 🏗️ MVVM Architecture  
- 📂 Local JSON Dataset  
- 🔍 Rule-Based Intent Matching  
- 📱 Android Studio  

---

## 🎯 Accuracy Methodology

Accuracy is achieved through:

- 🏷️ Manual semantic tagging  
- ⚖️ Weighted keyword scoring  
- ➕ Context bonus for multiple intent matches  
- 🔁 Session memory to prevent repetition  
- 🧪 Manual validation testing  

This ensures the system is:
- Explainable  
- Lightweight  
- Offline-ready  
- Academically suitable  

---

## 📌 Limitations

- Rule-based matching (not full NLP)  
- Cannot understand sarcasm or complex metaphors  
- Limited to dataset coverage  

---

## 🔮 Future Scope

- 🤖 NLP / ML integration  
- 🌍 Multi-language support  
- 🎙️ Voice-based interaction  
- ☁️ Cloud API integration  
- 📊 Emotion analytics  

---

## 👨‍💻 Developer

Built with dedication to merge technology with timeless wisdom.

---

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:8B0000,100:FF9933&height=120&section=footer"/>
</p>
