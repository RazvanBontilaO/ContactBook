# 📇 Contact Book (Java Console Application)

A simple **Java console-based contact management system** that allows users to add, edit, search, remove, and save contacts.  
This project demonstrates practical use of **OOP, collections, and file serialization** — perfect for building a solid Core Java foundation.

Inspired by Hyperskill-style learning projects.

---

## 📚 Project Overview

The Contact Book is an interactive console application where you can manage contact information such as names and phone numbers.  
It supports basic CRUD (Create, Read, Update, Delete) operations and automatically saves all data to a file so that contacts persist between program runs.

---

## 🧩 Features

- ➕ **Add** new contacts
- ✏️ **Edit** existing contacts
- ❌ **Remove** contacts
- 🔍 **Search** contacts by name or number
- 💾 **Save** contacts automatically to file
- 📂 **Load** saved contacts when restarting the app
- 🧠 **Input validation** and clean text interface

---

## 🏗️ Project Structure

ContactBook/
├── src/
| contactbook/
│ ├── Contact.java
│ ├── ContactStorage.java
│ └── Main.java
├── README.md
└── .gitignore

---

## 🚀 How to Run

1. Clone the repository:
   ```bash 
   git clone https://github.com/RazvanBontilaO/ContactBook.git

2. Open the project in your IDE (IntelliJ IDEA or VS Code).

3. Run the Main.java file.

4. Follow the on-screen command


---
## 🧠 Learning Objectives
Concept	Description
- OOP	Organize code into classes (Contact, ContactBook, etc.)
- Collections	Manage a dynamic list of contacts using ArrayList
- File I/O	Save and load data using Java serialization
- Exception Handling	Handle file read/write errors gracefully
- CLI Interaction	Build an interactive console interface

---
## 🧰 Technologies Used

- Language: Java 23+
- Tools: IntelliJ IDEA / VS Code
- Libraries: Core Java only (no frameworks)
- Concepts: OOP, File I/O, Serialization, Lists, Loops, Exception Handling

---

## 🧾 Future Improvements

- Add email and address fields to each contact
- Implement sorting by name or phone number
- Add import/export in CSV or JSON format
- Develop a simple GUI with JavaFX or Swing
- Create a Spring Boot REST API version of this project