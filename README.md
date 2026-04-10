# SauceDemo Automation Framework (POM)

### 🚨 Overview
This is an end-to-end **Selenium Automation Framework** built using the **Page Object Model (POM)** design pattern. It automates the testing of the [SauceDemo](https://www.saucedemo.com/) e-commerce website.

### 🛠 Tech Stack
- **Language:** Java 
- **Automation Tool:** Selenium WebDriver 
- **Build Tool:** Maven 
- **Test Framework:** TestNG 
- **Reporting:** ScreenshotListener (TestNG ITestListener)
- **Design Pattern:** Page Object Model (POM) 

### ✨ Key Features
- **Hybrid Framework:** Combination of Data-Driven and Page Object Model.
- **Dynamic Screenshot Capture:** Automatic screenshot generation for all failed test cases using a custom `ScreenshotListener`.
- **Config-Driven:** Environment-specific data (URL, Credentials) managed via `config.properties`.
- **Data Provider:** Implemented TestNG @DataProvider for testing multiple user scenarios (Valid/Invalid login).
- **Wait Strategies:** Used Explicit Waits and JavaScript Executor for handling dynamic elements.





## 🚀 How to Run the Project
1. **Clone the repository:** `git clone https://github.com/ayazsna37/SauceDemo-Automation-Framework-POM.git`
2. **Import in Eclipse:** Go to `File > Import > Existing Maven Projects` and select the project folder.
3. **Update Maven:** Right-click on the project > `Maven > Update Project` (to download Selenium & TestNG).
4. **Execute Tests:** - Find the **`testng.xml`** file in the project.
   - Right-click on **`testng.xml`** and select **Run As > TestNG Suite**.

---
*Developed by Ayaz Ahmad - Dedicated to Quality Assurance and Automation Engineering.*







