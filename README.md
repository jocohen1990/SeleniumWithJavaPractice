## Selenium with Java Practice

Selenium with Java framework, whilst incorporating Maven, TestNG, and eventually Gherkin scenarios.

## Description

This project was created while doing Dmitry Shyshkin's Selenium WebDriver: Selenium Automation Testing with Java course on Udemy. It incorporated Selenium 4 with Java, Maven, and TestNG on Windows. This was a beginner's course to introduce Selenium, Java, Maven, and TestNG, all of which I've been interested in learning to further my career in QA. My primary goal with this project was to become familiar with these concepts and technologies.

## Features Tested

- User login (positive and negative scenarios
- Cross-browser testing (Chrome, Firefox)
- Exceptions
  
## Getting Started

### Technologies Used

* Java 17 or higher
* Selenium 4 or higher
* Maven 3.6+
* TestNG
* Windows 10 or higher
* Chrome, Firefox
* Mac OS X or higher
* An IDE, either Visual Studio Code or IntelliJ
* Page Object Model
* practicetestautomation.com to view the website used for testing

## Prerequisites
* Java JDK 17 or higher
* Maven 3.6+
* Chrome/Firefox browsers installed

### Installing

1. Clone the repository
   git clone https://github.com/jocohen1990/SeleniumWithJavaPractice.git
2. Navigate to project directory
   src/test/java/com/practicetestautomation/tests
3. Install dependencies
   mvn clean install

### How to Run Tests

* Run all tests:
  mvn test

* Run specific test suite:
  Regression: mvn clean test
  Smoke test: clean test -DsuiteXmlFile=SmokeTestSuite.xml

* Run on a specific browser:
  mvn test -Dbrowser=firefox

## Project Structure

src/
├── main/java/
│   ├── pageobjects/     # Page Object classes (BasePage, ExceptionsPage, LoginPage, SuccessfulLoginPage)
├── test/java/
│   └── tests/exceptions # Exceptions tests
|   └── tests/login      # Login tests
|   └── BaseTest         # Base test class
├── test/resources/
│   ├── testsuites/      # All test suites XML files (Debug, Full Regression, SmokeTest)
│   └── testng.xml       # TestNG configuration
├── target/
    └── classes
    └── generated-sources
    └── generated-test-sources
    └── maven-status
    └── surefire-reports
    └── test-classes
    └── pom.xml

## Test Reports

After test execution, reports are generated in:
- `target/surefire-reports/` - TestNG reports

## Key Highlights
✓ Page Object Model for maintainability
✓ Cross-browser testing capability
✓ Detailed HTML reports

## Future Enhancements
- Add screenshot captures on failures
- Add Docker support
- Add Gherkin scenarios to incorporate Cucumber

## Author
Joshua Cohen
