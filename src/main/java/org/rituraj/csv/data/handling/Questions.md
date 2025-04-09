# CSV File Handling Problems

## Basic Problems

### 1. Read a CSV File and Print Data
**Task:** Read a CSV file containing student details (ID, Name, Age, Marks). Print each record in a structured format.

---

### 2. Write Data to a CSV File
**Task:** Create a CSV file with employee details (ID, Name, Department, Salary). Write at least 5 records to the file.

---

### 3. Read and Count Rows in a CSV File
**Task:** Read a CSV file and count the number of records (excluding the header row).

---

## Intermediate Problems

### 4. Filter Records from CSV
**Task:** Read a CSV file and filter students who have scored more than 80 marks. Print only the qualifying records.

---

### 5. Search for a Record in CSV
**Task:** Read an `employees.csv` file and search for an employee by name. Print their department and salary.

---

### 6. Modify a CSV File (Update a Value)
**Task:** Read a CSV file and increase the salary of employees from the "IT" department by 10%. Save the updated records back to a new CSV file.

---

### 7. Sort CSV Records by a Column
**Task:** Read a CSV file and sort the records by Salary in descending order. Print the top 5 highest-paid employees.

---

## Advanced Problems

### 8. Validate CSV Data Before Processing
**Task:** Ensure that the "Email" column follows a valid email format using regex. Ensure that "Phone Numbers" contain exactly 10 digits. Print any invalid rows with an error message.

---

### 9. Convert CSV Data into Java Objects
**Task:** Read a CSV file and convert each row into a `Student` Java object. Store the objects in a `List<Student>` and print them.

---

### 10. Merge Two CSV Files
**Task:** You have two CSV files: `students1.csv` (ID, Name, Age) and `students2.csv` (ID, Marks, Grade). Merge both files based on ID and create a new file containing all details.

---

### 11. Read Large CSV File Efficiently
**Task:** Given a large CSV file (500MB+), implement a memory-efficient way to read it in chunks. Process only 100 lines at a time and display the count of records processed.

---

### 12. Detect Duplicates in a CSV File
**Task:** Read a CSV file and detect duplicate entries based on the ID column. Print all duplicate records.

---

### 13. Generate a CSV Report from Database
**Task:** Fetch employee records from a database and write them into a CSV file. Include headers: Employee ID, Name, Department, Salary.

---

### 14. Convert JSON to CSV and Vice Versa
**Task:** Read a JSON file containing a list of students. Convert it into CSV format and save it. Implement another method to read CSV and convert it back to JSON.

---

### 15. Encrypt and Decrypt CSV Data
**Task:** Encrypt the sensitive fields (e.g., Salary, Email) while writing to a CSV file. Decrypt them when reading the file.

