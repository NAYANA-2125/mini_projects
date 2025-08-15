# mini_projects
Java mini project using loops and conditionals
# 🎯 Mini Project – Java-Based Quiz Application

I’m excited to share that I’ve successfully built a **Java quiz application** inspired by the *Kaun Banega Crorepati* format — using only **loops, conditionals, and structured programming**.

---

## 👨‍💻 What Does the Project Do?
✅ Collects candidate details (**name, city, age**, etc.) before the game starts  
✅ Presents **10 multiple-choice questions**, each with 4 options  
✅ Displays a **growing reward tree** – prize increases with each correct answer  
✅ Adds the candidate's name dynamically in every step (e.g., *“John, here is your 2nd question...”*)  
✅ Tracks winnings and stops on the **first wrong answer**  
✅ **Color-coded console output** using ANSI codes:
- 🟢 Green – Correct Answer
- 🔴 Red – Wrong Answer
- 🔵 Others – For information, tree, and updates  

---

## 🛠 Lifelines (Usable Only Once Each)
1️⃣ **Audience Phone** – Simulates audience voting percentages  
2️⃣ **50-50** – Eliminates two incorrect options  

Lifelines appear as a **5th option** and vanish after use.  
If already used, appropriate messages like *"No lifelines available"* are shown.

---

## 💡 Core Concepts Used
- 🔹 **Loops & Nested Conditionals**
- 🔹 **Structured Programming**
- 🔹 **Dynamic Output with Personalization**
- 🔹 **Logic-based Lifeline Control**
- 🔹 **Console Color Formatting**

---

## 📂 File Included
- `MiniProject1.java` – Contains the complete quiz application logic.

---

## 🚀 How to Run
### **Option 1 – Using Eclipse**
1. Open Eclipse → `File → Import → Existing Projects into Workspace`
2. Browse to your project folder and click **Finish**.
3. Right-click `MiniProject1.java` → **Run As → Java Application**

### **Option 2 – Using Command Line**

javac MiniProject1.java

java MiniProject1

📋 **Sample Console Output**

Enter your name: Nayana
Enter your city: Bengaluru
Enter your age: 21

Nayana, here is your 1st question:
Who is known as the Father of the Nation?
1) Mahatma Gandhi
2) Jawaharlal Nehru
3) Subhash Chandra Bose
4) Bhagat Singh
5) Lifeline

Your answer: 1
🟢 Correct! You have won ₹1,000

