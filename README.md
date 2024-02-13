# Getting The HollyDays of Chile
[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)


## Requirements

For building and running the application you need:
- [Spring Boot 3.1.8](https://spring.io/blog/2024/01/19/spring-boot-3-1-8-available-now)
- [JDK 17](https://adoptium.net/es/temurin/release-notes/?version=jdk-17.0.9+9)
- [Gradle 8.5](https://docs.gradle.org/8.5/release-notes.html)

## Description

In this application we can obtain the holidays of Chile through the public API of the Chilean government 
at the following URL:
- https://apis.digital.gob.cl/fl/feriados

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.example.gettingthehollydays.GettingTheHollydaysApplication` class from your IDE.

Alternatively you can use:

```shell
./gradlew bootRun
```


## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.