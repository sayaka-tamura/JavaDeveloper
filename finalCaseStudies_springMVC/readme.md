# Case Study: Personal Budget Application

Helps to manage monthly expenses and income.
Expenses are categorized into "food", "Housing cost", etc., and you would be able to see your own spending trend.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

* Apache Tomcat server 9
* Eclipse IDE
* Java 8 SDK * JRE
* Oracle 12c Database
* JUnit 4

### Installing

1.	Import all sql file in SQL folder to Oracle Databse
2.	Edit db.properties file in the src.CoreJava.resources package with your oracle database connection details


## Running the tests

All tests must be run with Junit 4. 
All test cases are located here
```
finalCaseStudies_springMVC/test
```

### JUnit 4 tests (Unit testing for each DAO methods)

All tests was done on only the DAOs, 
purpose of tests was to test if all methods in the DAOs perfomed basic CRUD

```
Run each test classes as JUnit test
```

## Known Bugs

* Hash password is displayed
* Shopping Id is not generated
* Different user has the same 'History' page

## Uncompleted

* Create income input function
* Show checking, saving, total spending on this month, expenses by category
* Show the list of checking, saving, total spending on this month on top page
* Connect to Bank account
* Put search function
* Generate shopping id, and put it to each item object
* Put sort function on list at 'History' page

## Problems faced

* User information did not show up on 'User Account' page after user log in.
* Some test cases did not work properly due to the unique key of a class I tested.

## Built With

* [Java](https://java.com/en/) - Programming language
* [Spring mvc](https://spring.io/) - Spring framework 5.0
* [JSP](http://www.oracle.com/technetwork/java/index-jsp-138231.html) - Java Server Pages
* JUNIT 4 - Test
* [Maven](https://maven.apache.org/) - Dependency Management

## User Stories

**** construction

## Authors

* **Sayaka Tamura** - *Development* - (https://github.com/sayaka-tamura)

