# Repository to Keep Track of Appium Workload
```I will be updating all my Appium Related Work in this Repository```
## About Appium

Appium is an open source test automation tool developed and supported by Sauce Labs to automate native and hybrid mobile apps. It is basically know as a Cross-Platform Mobile Automation Tool. It uses JSON wire protocol internally to interact with iOS and Android native apps using the Selenium WebDriver.

## Appium Architecture
Appium is a HTTP server written in node.js which creates and handles multiple WebDriver sessions for different platforms like iOS and Android. Appium starts a “test case” on the device that spawns a server and listens for proxies commands from the main Appium server. It is almost same as Selenium server which perceives HTTP requests from selenium client libraries and it handles those requests in different ways depending upon the platforms. Each vendor like iOS and Android have a different way and mechanism to run a test case on the device so Appium kind of hacks in to it and run this testcase after listening commands from Appium server
