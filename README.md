# Java Selenium Cucumber Framework

This is a test automation framework built using **Java**, **Selenium**, and **Cucumber**. It is designed to support behavior-driven development (BDD) and provides a structured approach to writing and executing automated tests for web applications, API applications and Database applications.

## Features

- **Cucumber BDD**: Write test scenarios in Gherkin syntax for better readability and collaboration.
- **Selenium WebDriver**: Automate browser interactions for end-to-end testing.
- **Page Object Model (POM)**: Maintainable and reusable page object structure.
- **Hooks**: Use `@Before` and `@After` hooks for setup and teardown.
- **Cross-Browser Testing**: Easily configure tests to run on different browsers.
- **Reports**: Generate detailed test execution reports.

## Prerequisites

Before setting up the framework, ensure you have the following installed:

- **Java JDK** (version 11 or higher)
- **Maven** (for dependency management)
- **IDE** (e.g., IntelliJ IDEA, Eclipse)

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd java-selenium-cucumber-framework
   ```

2. **Install Dependencies**:
   Run the following command to download all required dependencies:
   ```bash
   mvn clean install
   ```

3. **Run Tests**:
   Execute the following command to run the tests:
   ```bash
   mvn test
   ```

## Project Structure

```
src
├── main
│   ├── java
│   │   ├── pages          # Page Object Model classes
│   │   ├── utilities      # Utility classes (e.g., BaseClass, SeleniumTestBase)
│   └── resources          # Configuration files
├── test
│   ├── java
│   │   ├── stepDefinitions # Step definition classes
│   │   ├── runners         # Test runners
│   └── resources
│       ├── features        # Cucumber feature files
```

## Writing Tests

1. **Create a Feature File**:
   Write test scenarios in Gherkin syntax under the `src/test/resources/features` directory. Example:
   ```gherkin
   Feature: Book Store Application

   @BookStoreDemo
   Scenario: User logs in and searches for a book
       Given User navigate to the book store application login with url "http://example.com"
       When User logs in with username "testuser" and password "password123"
       Then User should see the book store homepage
   ```

2. **Implement Step Definitions**:
   Map the Gherkin steps to Java methods in the `stepDefinitions` package.

3. **Run the Tests**:
   Use the test runner class in the `runners` package to execute the tests.

## Reporting

After running the tests, reports will be generated in the `Reports` directory. You can configure reporting plugins in the `pom.xml` or test runner class.

## Contributing

Contributions are welcome! Feel free to submit issues or pull requests to improve the framework.

## License

This project is licensed under the MIT License.
