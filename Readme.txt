test-automation-Wikipedia
Wikipedia project for test automation, covering UI acceptance testing:
The UI framework created using Cucumber BDD in Gherkin language.
For assertion in UI, Junit is used.


Concepts Included
Cucumber BDD testing for UI
Shared state across cucumber step definitions
Dependency injection
Page Object pattern
Common web page interaction methods
Commonly used test utility classes


Tools
Maven
Cucumber-JVM
JUnit
Selenium Webdriver


Requirements
In order to utilise this project you need to have the following installed locally:
Maven 4.0.0
Chrome and Chromedriver (UI tests use Chrome by default, can be changed in config)
Java 11 - version 11.0.12
IntelliJ IDEA - version 2021.3.3

Dependencies:
In order to utilise this project you need to have following dependencies in pom.xml
and you can find them https://mvnrepository.com

Selenium-version 4.1.3
Webdrivermanager - version 5.1.0
Cucumber-java - version 5.7.0
Cucumber-junit - version 5.7.0


Plugins
maven-surefire-plugin - version 2.22.2
maven-cucumber-reporting - version 5.0.0

Usage
The project is broken into separate modules for UI.
Each of these modules can be utilised independently of the others using maven profiles.

in terminal with command:
mvn test 
mvn verify

To run UI  tests only, navigate to Challenge1-UI-runners directory and run:

CukesRunner

Reporting
Reports for each module are written into their respective /target directories after a successful run.

UI acceptance tests result in a HTML report for each feature in
WikipediaUITests\target\default-html-reports\index.html
WikipediaUITests\target\cucumber-html-reports\overview-failures.html
In the case of test failures, a screen-shot of the UI at the point of failure is embedded into the report.
