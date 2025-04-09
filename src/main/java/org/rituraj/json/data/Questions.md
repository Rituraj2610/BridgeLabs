JSON Practice Problems
1. Create a JSON Object
   Task: Create a JSON object for a Student with fields: name, age, and subjects (array).

Hint: Use Jackson or Gson to build and serialize the JSON structure.

--- 

2. Convert Java Object to JSON
   Task: Create a Car class and convert its instance to JSON format.

Hint: Use ObjectMapper.writeValueAsString(carObject) in Jackson.

---

3. Extract Specific Fields from JSON
   Task: Read a JSON file and extract fields such as name and email.

Hint: Parse JSON into a tree or map, then access specific fields.

---

4. Merge Two JSON Objects
   Task: Merge two separate JSON objects into one.

Hint: Use ObjectNode in Jackson or JsonObject in Gson to combine entries.

---

5. Validate JSON Structure
   Task: Validate a JSON object against a defined schema.

Hint: Use a JSON schema validator like everit-org/json-schema.

---

6. Convert List to JSON Array
   Task: Convert a List<Person> to a JSON array.

Hint: Serialize the list using ObjectMapper.writeValueAsString().

---

7. Filter JSON by Age
   Task: From a JSON array of users, print users with age > 25.

Hint: Parse into a list and filter using Java Streams.

---

8. Print All JSON Keys and Values
   Task: Recursively iterate and print all keys and values from a JSON file.

Hint: Use JsonNode.fields() or entrySet() for recursion.

---

9. Convert JSON to XML
   Task: Convert a JSON file into equivalent XML.

Hint: Use XmlMapper (Jackson XML) for conversion.

---

10. Convert CSV to JSON
    Task: Parse CSV file data and convert to JSON format.

Hint: Use Apache Commons CSV or OpenCSV for reading.

---

11. Generate JSON Report from DB
    Task: Fetch employee records from DB and generate a JSON report.

Hint: Convert ResultSet rows to objects, then serialize the list to JSON.

---

12. Merge JSON Files
    Task: Merge contents of two JSON files into a single object or array.

Hint: Read and combine JsonNode trees or use object merging logic.

---

13. Validate Email Field Using Schema
    Task: Check that the email field conforms to a valid email pattern.

Hint: Use regex in your JSON schema validator.

IPL and Censor Analyzer
Objective
Build a Java application that reads IPL match data from JSON and CSV files, censors sensitive data, and writes the output to new files.

a. Input Formats
   JSON Input: IPL data in structured JSON format.

CSV Input: IPL data with fields like team names, player of the match, etc.

Hint: Use ObjectMapper for JSON and BufferedReader/OpenCSV for CSV.

b. Censorship Rules
   Mask Team Names: Replace second word in team names with ***.

Example: "Mumbai Indians" → "Mumbai ***"

Redact Player of the Match: Replace with "REDACTED".

Hint: Use split(" ") and string replacement techniques.

c. Output Formats
   Censored JSON Output: Write processed data to a new JSON file.

Censored CSV Output: Write the sanitized data into a new CSV file.

Hint: For output, use ObjectMapper.writeValue() for JSON and CSVWriter for CSV.