# frontend-for-testers-automation

## Used technologies

* Maven
* JBehave
* Selenium

## What do I need to install?

* `JDK 8` installed and properly set in your `JAVA_HOME` / `PATH` environment variable.
* `Maven` installed and properly set in you `M2_HOME` / `PATH` any version from 3 should work
* `Google Chrome v69-v71` should be installed.
* `Chrome driver` should be placed in the root folder. A driver for Windows and Chrome v69-71 is already in place. In case a different version is used or another OS
is needed, it is necessary to replace the chrome.driver executable with a compatible one [(can be downloaded here)](http://chromedriver.chromium.org/) 

## How to run it?

Within the root folder of the project, run following code in order to execute tests and generates a report in 
target/jbehave/view/reports.html

```
mvn clean verify
```

* `mvn` executes the goals
* `clean` is a built-in task that erases target folder and `verify` task executes the tests
