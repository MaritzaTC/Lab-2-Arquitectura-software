# Lab-2-Arquitectura-software
[![CI/CD Pipeline](https://github.com/MaritzaTC/Lab-2-Arquitectura-software/actions/workflows/build.yml/badge.svg)](https://github.com/MaritzaTC/Lab-2-Arquitectura-software/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=bugs)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=coverage)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=MaritzaTC_Lab-2-Arquitectura-software&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=MaritzaTC_Lab-2-Arquitectura-software)

Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and
Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies

Arquitectura de Software
Universidad de Antioquia

### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
