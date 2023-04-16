# AppiumSignUpTask
StudyDrive Sign Up 

## Prerequisites:
-Java should be installed.
-Install JDK and set a path of JDK and bin folder
- Download and install Java (JDK) and set a path of JDK and bin folder.
- You should have an Android 8.0 emulator configured.
- Or real device should be configured in Desired Capabilities.

## Installation

- Download appium from official site. (Run downloaded exe file)
- Install via npm: npm install -g appium.
- Install appium doctor dependencey
- npm install -g appium-doctor.
- Run the appium-doctor command, to verify the installation. 
- For Android install UiAutomator2 Driver to capture screenshots.
- For iOS set up XCUITest Driver.

## WorkFlow:

- Use Page object model design pattern to automate mobile sign up.
- Two files one is for page objects in which we store all selectors/page objects.
- Second file is Register.java in which we access page objects/selectors and automate sign up process.
- Third file is testng.xml in which we mention the sequence of our test cases
