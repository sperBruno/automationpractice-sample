# truex-sample
This POC project is testing the User Interface of http://automationpractice.com/index.php web application by using the following:
1. Selenium as a tool to interact and perform operations on the web browser
2. Java as a programming language.
3. Cucumber to handle the Gherkin style.  


#Requirements
To have the project running user needs to have the following installed:
1. Java JDK 8
2. Java JRE 8
3. Gradle
4. Intellij IDE
5.Firefox or Chrome drive

#Execute Feature files
1. Download Chrome or Firefox WebDriver and place the driver on drivers folder on the root path of the project
2. Open a cmd console
3. Navigate to the project path. ex. D:\repositories\java\automationpractice-sample
4. Execute the command: gradle executeFeatures
5. Open the report on a web browse. ex. D:\repositories\java\automationpractice-sample\build\cucumber-html-report\index.html
