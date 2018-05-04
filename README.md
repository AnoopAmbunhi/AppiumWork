# Repository to Keep Track of Appium Workload```I will be updating all my Appium Related Work in this Repository```
## About Appium

Appium is an open source test automation tool developed and supported by Sauce Labs to automate native and hybrid mobile apps. It is basically know as a Cross-Platform Mobile Automation Tool. It uses JSON wire protocol internally to interact with iOS and Android native apps using the Selenium WebDriver.

## Appium Architecture
Appium is a HTTP server written in node.js which creates and handles multiple WebDriver sessions for different platforms like iOS and Android. Appium starts a “test case” on the device that spawns a server and listens for proxies commands from the main Appium server. It is almost same as Selenium server which perceives HTTP requests from selenium client libraries and it handles those requests in different ways depending upon the platforms. Each vendor like iOS and Android have a different way and mechanism to run a test case on the device so Appium kind of hacks in to it and run this testcase after listening commands from Appium server

## Appium Setup
Please Note that the below setup has been done and tested on MAC OS
Make sure you have the latest mac (since xcode version is dependent on your mac os version) version and your editor is updated

1. Install Brew, Node & npm on your machine via iterm

```
brew tap caskroom/versions
brew update
brew install carthage
brew install node
npm install -g npm
```

Check the Node & npm version
```
node --version
npm --version
```

2. Install Latest Version of Java. I am installing Java 8 because it is the LTS Version (Long Term Support)
`brew cask install java8`


3. Install Appium and Web driver globally

```
npm install -g appium
npm install wd
```

4. [Download JDK Latest Version](http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html)

5. Download the Selenium, Selenium Stand Alone and Appium JAR's for Java Client
[Selenium JAR for JAVA](https://docs.seleniumhq.org/download/)
[Selenium Standalone JAR](https://www.seleniumhq.org/download/)
[Appium Client Libraries](https://search.maven.org/#search%7Cga%7C1%7Cg%3Aio.appium%20a%3Ajava-client)

6. Install IntelliJ IDEA, and Go to File -> Project Structure -> Upload the JDK from local machine

## Android Automation

7. For `Android Automation`, We need to install the `Android Studio`
[Android Studio](https://developer.android.com/studio/)


8. Update System Preferences, Open bash_profile in terminal:

```
nano ~/.bash_profile
Paste the below :
export ANDROID_HOME=/Users/User_name/Library/Android/sdk
export PATH=$ANDROID_HOME/platform-tools:$PATH
export PATH=$ANDROID_HOME/tools:$PATH
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=$JAVA_HOME/bin:$PATH
SAVE AND EXIT TERMINAL
```

9. Check that JAVA_HOME and ANDROID_HOME is set:

```
$echo $JAVA_HOME
$echo $ANDROID_HOME
```

10. Open the `Android Studio` and go to `Preferences -> System Settings -> Android SDK` & Download the Necessary Package.



