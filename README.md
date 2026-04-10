# SauceDemo Automation Framework (POM)

### 🚨 Overview
This is an end-to-end **Selenium Automation Framework** built using the **Page Object Model (POM)** design pattern. It automates the testing of the [SauceDemo](https://www.saucedemo.com/) e-commerce website.

### 🛠 Tech Stack
* [cite_start]**Language:** Java [cite: 11, 28]
* [cite_start]**Automation Tool:** Selenium WebDriver [cite: 11, 28]
* [cite_start]**Build Tool:** Maven [cite: 11, 31]
* [cite_start]**Test Framework:** TestNG [cite: 11, 28, 31]
* **Reporting:** ScreenshotListener (TestNG ITestListener)
* [cite_start]**Design Pattern:** Page Object Model (POM) [cite: 11, 29]

### ✨ Key Features
* [cite_start]**Hybrid Framework:** Combination of Data-Driven and Page Object Model[cite: 29].
* **Dynamic Screenshot Capture:** Automatic screenshot generation for all failed test cases using a custom `ScreenshotListener`.
* **Config-Driven:** Environment-specific data (URL, Credentials) managed via `config.properties`.
* [cite_start]**Data Provider:** Implemented TestNG @DataProvider for testing multiple user scenarios (Valid/Invalid login)[cite: 31].
* [cite_start]**Wait Strategies:** Used Explicit Waits and JavaScript Executor for handling dynamic elements[cite: 33].

### 📂 Project Structure
* `src/main/java/com/base`: Contains `BaseTest.java` for driver initialization.
* `src/main/java/com/pages`: Contains Page classes (LoginPage, InventoryPage, CartPage).
* `src/main/java/com/utils`: Contains Listeners and Utility classes.
* `src/test/java/com/tests`: Contains the Test Class with all test scenarios.

### 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/ayazsna37/SauceDemo-Automation-Framework-POM.git](https://github.com/ayazsna37/SauceDemo-Automation-Framework-POM.git)
   ## 🚀 How to Run the Project
1. **Clone the repository:** `git clone https://github.com/ayazsna37/SauceDemo-Automation-Framework-POM.git`
2. **Import in Eclipse:** Go to `File > Import > Existing Maven Projects` and select the project folder.
3. **Update Maven:** Right-click on the project > `Maven > Update Project` (to download Selenium & TestNG).
4. **Execute Tests:** - Find the **`testng.xml`** file in the project.
   - Right-click on **`testng.xml`** and select **Run As > TestNG Suite**.

---
*Developed by Ayaz Ahmad - Dedicated to Quality Assurance and Automation Engineering.*

   # Selenium-Automation-Framework 🚀

This is a professional Automation Testing Framework built using **Java** and **Selenium WebDriver**. It is designed using the **Page Object Model (POM)** to ensure code reusability and easy maintenance.

## 🛠 Tech Stack & Tools
- **Language:** Java (Core & Advanced)
- **Automation Tool:** Selenium WebDriver (Latest Version)
- **Framework:** TestNG (Execution & Assertions)
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)
- **Data Management:** Apache POI (Excel Data-Driven Testing)
- **IDE:** Eclipse

## ⚙️ Key Features
- **Page Object Model:** Separated Locators (By class) from Test Logic.
- **Data-Driven Testing:** Reads test data from external **Excel (.xlsx)** files using Apache POI.
- **Wait Mechanism:** Handled dynamic elements using Implicit and Explicit waits.
- **Robust Locators:** Used ID, Name, and XPath for reliable element identification.
- **Assertions:** Used TestNG Assertions to verify test results (Pass/Fail).


