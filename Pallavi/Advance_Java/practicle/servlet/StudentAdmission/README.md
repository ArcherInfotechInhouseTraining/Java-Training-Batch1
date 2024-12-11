
# College Admission Portal

## Project Overview
The **College Admission Portal** is a web-based application designed to streamline the document verification process for college admissions. This project includes functionalities such as uploading and verifying documents, approving student applications, and managing degree and diploma data.

---

## Features
- **Admin Panel**:
  - Displays degree and diploma document verification tables.
  - Approve or reject documents based on their status.
  - Supports dynamic filtering based on the action (e.g., degree, diploma).
  
- **Document Verification**:
  - View twelfth-grade marksheets and CET documents.
  - Approve applications via a checkbox system.

- **Styling and Responsiveness**:
  - Modern, responsive design using Bootstrap.
  - Custom styles applied through `styles.css`.

- **User-Friendly Experience**:
  - Scrollable interface with a hidden scrollbar for a clean look.
  - Background image for a visually appealing layout.
  - Form elements styled for accessibility and clarity.

---

## Technologies Used
- **Frontend**:
  - HTML, CSS (via `styles.css`), and Bootstrap for responsive design.
  
- **Backend**:
  - Java Servlets for dynamic content generation.
  - JDBC for database interaction.

- **Database**:
  - MySQL (or equivalent) for storing student records and document paths.

---

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/college-admission-portal.git
   ```

2. **Configure Database**:
   - Create a database for storing student data.
   - Import the required schema and sample data from `database.sql`.

3. **Update Database Credentials**:
   - Open the `AdminServlet` and replace the placeholder constants:
     ```java
     final String URL = "jdbc:mysql://localhost:3306/college_admissions";
     final String USER = "your-username";
     final String PASSWORD = "your-password";
     ```

4. **Deploy the Application**:
   - Use a servlet container like Apache Tomcat to deploy the WAR file or run directly from your IDE.

5. **Launch the Application**:
   - Open a browser and navigate to:
     ```
     http://localhost:8080/college-admission-portal
     ```

---

## File Structure
```plaintext
project-root/
├── src/
│   ├── AdminServlet.java    # Handles admin-related actions
│   ├── ConfirmServlet.java  # Processes document approvals
├── webapp/
│   ├── styles.css           # Custom CSS for styling
│   ├── index.html           # Entry point
│   ├── images/              # Background and other images
├── database.sql             # SQL schema for database setup
└── README.md                # Project documentation
```

---

## Customization
1. **Styling**:
   - Modify `styles.css` to adjust the background image or button styles.
   - Add more styles to enhance visual appeal.

2. **Document Paths**:
   - Update the database to include document paths specific to your environment.

3. **Error Handling**:
   - Extend error handling for database connectivity or form submissions.

---

## Features in Action
### Admin Panel
- A responsive table displays:
  - Student IDs.
  - Twelfth-grade marksheet and CET document links.
  - Approval checkboxes (disabled for already approved documents).

### Styling
- **Background Image**:
  - Applied globally with `background-size: cover` for full-screen coverage.
- **Scrollbar**:
  - Scroll functionality is retained, but the scrollbar is visually hidden for a clean UI.

---

## Future Enhancements
- Add user authentication for admins and students.
- Implement bulk upload and approval features.
- Integrate email notifications for application status.

---

## Screenshots

### Admin Panel


### Admin Panel


### Admin Panel

![Admin Panel](path-to-screenshot-admin-panel.png)

### Document Verification
![Document Verification](path-to-screenshot-document-verification.png)



<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/admin_dashboard.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/admission_form.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/document_verification.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/login.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/payment.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/payment.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/payment_successfull.png">

<img src="https://github.com/ArcherInfotechInhouseTraining/Java-Training-Batch1/blob/main/Pallavi/Advance_Java/practicle/servlet/StudentAdmission/src/main/webapp/output/registration.png">



---

## License
This project is open-source and available under the [MIT License](LICENSE).
