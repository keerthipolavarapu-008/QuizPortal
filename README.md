# Quiz Portal 🎯

An interactive **Quiz Portal** desktop application developed using **Java Swing (NetBeans IDE)**.  
All project files (code, report, SQL) are organized inside the `src/` folder.

---

## 📂 Project Structure
quiz-portal/
└─ src/
├─ java/ # Java source files (all Swing code)
├─ report/ # Project documentation
│ └─ Quiz_Portal_Project_Report.pdf
├─ quiz_portal.sql # Database schema
└─ README.md # Project guide (this file)

yaml
Copy code

---

## ✨ Features

### 👤 User Module
- Registration form with auto-generated **User ID** (stored in the database).
- 10-minute **timed quiz** with randomized questions.
- Instant **result evaluation**:
  - **Pass** if score ≥ 5  
  - **Fail** if score < 5  

### 🔐 Admin Module
- Secure login with username and password.
- Navigation bar with options:
  - Add Question
  - Update Question
  - Delete Question
  - Display All Questions
  - Logout / Exit
- Perform CRUD operations on the quiz question bank.

---

## 🛠️ Tech Stack
- **Language:** Java  
- **Framework:** Java Swing  
- **IDE:** NetBeans  
- **Database:** MySQL (or any JDBC-compatible database)  

---

## 🚀 Running the Project
1. Open the project in **NetBeans**.  
2. Import the database schema (`src/quiz_portal.sql`) into your MySQL server.  
3. Update the database connection settings in the Java code.  
4. Build and run the application in NetBeans.  

---

## 📖 Project Report
The full project report is available here:  
[📄 Quiz_Portal_Project_Report.pdf](src/report/Quiz_Portal_Project_Report.pdf)

---

## 🗄️ Database Setup
- Default admin login:
  - **Username:** `admin`
  - **Password:** `admin123`

The schema (`quiz_portal.sql`) creates:
- `users` → stores registered users  
- `questions` → stores quiz questions  
- `results` → stores user quiz attempts  

---

## 📸 Screenshots
*(Add screenshots here if available — e.g., login page, quiz page, admin page)*

---

## 🔮 Future Enhancements
- Support for multiple subjects and difficulty levels.  
- Detailed result analysis with charts/score breakdown.  
- Multimedia questions (images, audio, video).  
- Web-based or mobile version for broader access.  

---

## 👨‍💻 Author
- **Your Name**  
*(Add your email or GitHub profile if you want)*
