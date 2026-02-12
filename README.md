# 🕉️ Krishna-Verse  
### 📱 A Jetpack Compose GPT App Grounded in the Bhagavad Gita

Krishna-Verse is an Android application built using **Kotlin** and **Jetpack Compose** that provides Bhagavad Gita-based guidance through a clean chat-style interface 💬📖  
Users can ask questions related to real-life problems (stress, fear, motivation, confusion, duty, etc.), and the app responds with a relevant **Bhagavad Gita shloka** along with its Sanskrit text and meaning.

To make the explanation easier for users, the app also integrates a **GPT API** that generates a simple modern interpretation based on the selected verse 🤖✨

---

## ✨ Key Features

- 💬 Chat-style interface built using **Jetpack Compose**
- 📖 Displays relevant Bhagavad Gita shlokas for user queries
- 💾 Stores shlokas locally using an **offline JSON dataset**
- 🕉️ Shows **Sanskrit + transliteration + meaning**
- 🤖 GPT-based simplified explanation for better understanding
- 🌅 Daily Krishna Message (motivational verse feature)

---

## 🏗️ How the App Works (Workflow)

1. The user enters a question in the chat screen  
2. The app searches the local **JSON file** for a relevant shloka  
3. The selected verse is displayed (Sanskrit + meaning)  
4. The user query + selected shloka is sent to the GPT API  
5. GPT returns a simplified modern explanation  
6. The final output is shown in the chat interface  

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **ViewModel + State Management**
- **Coroutines** (for API calls)
- **Local JSON file** (offline Bhagavad Gita shloka storage)
- **GPT API Integration** (for explanation generation)

---

## 📸 Screenshots

Add your screenshots in the `images/` folder and link them here 👇

```md
![Chat UI](images/2.jpg)
![Shloka Output](images/3.jpg)
