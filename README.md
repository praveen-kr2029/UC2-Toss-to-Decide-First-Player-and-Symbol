# 🎮 Console Tic-Tac-Toe Game (Java)

## 📌 Project Overview
This project is a **console-based Tic-Tac-Toe game** developed in Java.  
It is designed to help understand core programming concepts such as arrays, loops, conditional logic, and modular programming.

The project is implemented step-by-step using multiple **Use Cases (UC1–UC5)**.

---

## 🎯 Learning Objective
- Strengthen logical thinking
- Understand control flow
- Practice modular programming
- Build a complete game step-by-step

---

## 📂 Project Structure

TicTacToe/
│
├── UC1_DisplayBoard/
├── UC2_Toss/
├── UC3_UserInput/
├── UC4_SlotConversion/
├── UC5_ValidateMove/

---

# 🧩 Use Case Details

---

## ✅ UC1: Display Empty Tic-Tac-Toe Board

### Goal
Display an empty 3×3 board on the console.

### Concepts Used
- 2D Array
- Initialization Logic
- Nested Loops
- Console Formatting

### Output

---

## ✅ UC2: Toss to Decide First Player and Symbol

### Goal
Randomly decide which player starts and assign symbols (X or O).

### Concepts Used
- Random Number Generation
- Conditional Logic
- Game State Variables

### Functionality
- Simulates a toss
- Assigns X and O
- Decides first player

---

## ✅ UC3: Accept User Slot Input (1–9)

### Goal
Allow user to enter a slot number.

### Concepts Used
- User Input Handling (Scanner)
- Method Creation
- Separation of Concerns

### Functionality
- Reads integer input
- Returns selected slot

---

## ✅ UC4: Convert Slot Number to Board Index

### Goal
Convert slot (1–9) into row and column.

### Concepts Used
- Zero-based Indexing
- Mathematical Mapping
- Division and Modulo

### Formula Used

row = (slot - 1) / 3
col = (slot - 1) % 3


---

## ✅ UC5: Validate User Move

### Goal
Ensure move is valid.

### Concepts Used
- Conditional Logic
- Boundary Checking
- Defensive Programming

### Validation Rules
- Row and column must be between 0–2
- Cell must be empty (`-`)

---

# 🚀 How to Run

1. Open project in VS Code  
2. Compile:

javac FileName.java


3. Run:

java FileName


---

# 🛠️ Technologies Used
- Java
- VS Code
- Git & GitHub

---

# 📌 Future Enhancements
- Combine all use cases into one game
- Add win/draw detection
- Add computer opponent
- Add GUI (Java Swing)

---

# 👨‍💻 Author
PRAVEEN KUMAR

# ⭐ Conclusion
This project demonstrates how a complete application can be built step-by-step using small usecases, improving both coding skills and problem-solving ability.
