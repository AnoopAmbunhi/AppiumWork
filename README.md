# Repository to Keep Track of Appium Workload
```I will be updating all my Appium Related Work in this Repository```
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
Add Image here

11. I use `Genymotion Virtual Emulator` for Android and i love it. You can try it too.

Follow the Steps to install Genymotion :
https://docs.genymotion.com/Content/01_Get_Started/Installation.htm

* Launch Genymotion and Click "Settings"→ ADB and set the path for Android-SDK.

* [Add a New Virtual Device by clicking on the "Add" button](https://docs.genymotion.com/Content/02_Application/Adding_a_new_virtual_device/Adding%20a%20new_virtual_device.htm)

* Select the Virtual Device Created and Click "Start".

* Launch Appium and Navigate to Android Settings. Change the Capabilities as per the selected Virtual device.

* Launch the Appium Inspector.

* How to install .apk file into Genymotion Emulator :

- To check the devices attached to the local machine
`adb devices`

- adb install PATH_TO_APK
`adb install /Users/USER_NAME/Workspace/qa_android_em_app/YourAPK.apk`

## IOS Automation

12. Install the `XCODE Dependencies`

```
$ xcode-select --install
$ sudo xcode-select --reset
$ sudo xcode-select --switch /Applications/Xcode.app
$ brew install libimobiledevice --HEAD

There is also a dependency, made necessary by Facebook’s WebDriverAgent, for the Carthage dependency manager.
$ brew install carthage

Deviceconsole allows analyzing crash logs and console output from the device
$ npm install deviceconsole

Install and debug iPhone apps from the command line, without using Xcode
$ brew install ios-deploy

Xcpretty is a fast and flexible formatter for xcodebuild
$ gem install xcpretty

You need to authorize use of the iOS Simulator. If you’re only testing Android, this can be skipped.
$ npm install -g authorize-ios
$ authorize-ios
```

13. Launch the IOS Simulator by opening XCODE or Launch it through command Line

- See all the Available Simulator Devices Created along with `UDID`
`xcrun simctl list`

- Install and Launch the Application
`
xcrun simctl install <YOUR-DEVICE-ID> <PATH-TO-APPLICATION-BUNDLE>
xcrun simctl launch <YOUR-DEVICE-ID> <BUNDLE-ID-OF-APP-BUNDLE>
`

- Need Help?
`xcrun simctl help`

14. Install `appium-doctor` to verify that all of Appium’s dependencies are met :

```
$ npm install -g appium-doctor
$ appium-doctor
$ appium-doctor --ios
$ appium-doctor --android
```

`IMAGE HERE`

15. Install the `Inspector that you can use to look at your app's elements, get basic information about them, and perform basic interactions with them`
I Suggest the Following based on my experience :

`IOS` - [Appium Desktop](https://github.com/appium/appium-desktop)
`Android` - [UI Automator Viewer](https://www.youtube.com/watch?v=uA54T6R8nhs)

## Tasks List

- [x] Install Brew, Node & NPM
- [x] Install Java, JDK and export Path to bash file
- [x] Install Appium Globally
- [x] Download Selenium, Appium and Selenium Standalone JARS
- [ ] Add External JARS to Java Build Path
- [x] Install Android Studio and download the packages
- [x] Install Genymotion Emulator and Launch the Emulator
- [x] Install Xcode Dependencies
- [x] Install IOS Simulator via terminal
- [x] Install Appium Doctor and check if all Appium dependencies are met for `Android` & `IOS`
- [x] Inspector for `Android` & `IOS`
- [ ] Creation One-time Configuration of `DesiredCapabilities` for `IOS`
- [ ] Creation One-time Configuration of `DesiredCapabilities` for `Android`
- [ ] Installing Dependencies for CI tool

- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `MORE TO FOLLOW...`

If you need any help with the installation, please contact me on `anoop.ambunhi@gmail.com`




