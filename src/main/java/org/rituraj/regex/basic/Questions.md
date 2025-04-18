## 📝 Basic Regex Problems

### ✅ 1. Validate a Username

**Rules:**
- Can contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
- Must start with a letter
- Length: 5–15 characters

**Examples:**
- ✅ `user_123` → Valid
- ❌ `123user` → Invalid (starts with a number)
- ❌ `us` → Invalid (too short)

---

### ✅ 2. Validate a License Plate Number

**Rules:**
- Starts with **two uppercase letters**
- Followed by **four digits**

**Examples:**
- ✅ `AB1234` → Valid
- ❌ `A12345` → Invalid

---

### ✅ 3. Validate a Hex Color Code

**Rules:**
- Starts with `#`
- Followed by 6 hexadecimal digits (`0-9`, `A-F`, `a-f`)

**Examples:**
- ✅ `#FFA500` → Valid
- ✅ `#ff4500` → Valid
- ❌ `#123` → Invalid

---

## 🔍 Regex Extraction Problems

### ✅ 4. Extract All Email Addresses from Text

**Input:**  
`Contact us at support@example.com and info@company.org`

**Expected Output:**
- support@example.com
- info@company.org


---

### ✅ 5. Extract Capitalized Words

**Input:**  
`The Eiffel Tower is in Paris and the Statue of Liberty is in New York.`

**Expected Output:**
Eiffel, Tower, Paris, Statue, Liberty, New, York


---

### ✅ 6. Extract Dates (dd/mm/yyyy)

**Input:**  
`The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.`

**Expected Output:**
12/05/2023, 15/08/2024, 29/02/2020


---

### ✅ 7. Extract URLs from Text

**Input:**  
`Visit https://www.google.com and http://example.org for more info.`

**Expected Output:**
- https://www.google.com
- http://example.org

---

## 🔄 Regex Replace/Modify Problems

### ✅ 8. Replace Multiple Spaces with a Single Space

**Input:**  
`"This  is   an    example   with multiple   spaces."`

**Expected Output:**  
`"This is an example with multiple spaces."`

---

### ✅ 9. Censor Bad Words

**Input:**  
`"This is a damn bad example with some stupid words."`

**Bad Words List:**  
`["damn", "stupid"]`

**Expected Output:**  
`"This is a **** bad example with some **** words."`

---

