# DemoQA Book Store Automation

## Project Overview

This project automates the Book Store application available at:

https://demoqa.com/books

### Automated Scenarios

* Open Book Store application
* Search for **"Git Pocket Guide"**
* Validate search result
* Open the book details page
* Verify book details
* Implemented using:

  * Selenium WebDriver
  * Java
  * TestNG
  * Gradle
  * Page Object Model (POM)
  * Explicit Waits

---

## Project Structure

```text
src
├── main
│   ├── java
│   │   ├── pages
│   │   │   ├── HomePage.java
│   │   │   └── BookDetailsPage.java
│   │   └── utils
│   │       └── DriverFactory.java
│
├── test
│   └── java
│       └── tests
│           ├── BaseTest.java
│           └── SearchBookTest.java

build.gradle
README.md
```

---

## Prerequisites

Install the following:

### Java

* JDK 17 or higher

Verify installation:

```bash
java -version
```

### Gradle

Verify installation:

```bash
gradle -v
```

or use the included Gradle Wrapper:

```bash
gradlew -v
```

### Google Chrome

Latest stable version recommended.

---

## Clone Repository

```bash
git clone <repository-url>
cd BookStoreAutomationV2
```

Example:

```bash
git clone https://github.com/your-username/BookStoreAutomationV2.git
cd BookStoreAutomationV2
```

---

## Install Dependencies

Gradle automatically downloads dependencies:

```bash
gradlew clean build
```

---

## Run Tests

### Run All Tests

Windows:

```bash
gradlew test
```

## Test Scenario

### Verify Book Search and Details

Steps:

1. Navigate to Book Store application
2. Search for "Git Pocket Guide"
3. Validate search result
4. Open book details page
5. Verify book title

Expected Result:

* Search result displays "Git Pocket Guide"
* Book details page displays correct title information

---

## Design Pattern

### Page Object Model (POM)

The framework follows POM to improve:

* Readability
* Reusability
* Maintainability

Pages:

* HomePage
* BookDetailsPage

---

## Dependencies

```gradle
dependencies {
    implementation 'org.seleniumhq.selenium:selenium-java:4.21.0'
    implementation 'io.github.bonigarcia:webdrivermanager:5.8.0'

    testImplementation 'org.testng:testng:7.10.2'
}
```


## Author

Masrur Ahmed Santo

Software Quality Assurance Engineer
