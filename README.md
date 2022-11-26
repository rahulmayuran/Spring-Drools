**Spring Drools**
================

Intro
-----------
Rule Engine

![](https://miro.medium.com/max/1100/1*V31gpm8YhglXFqz1idrYiA.gif)

- .drl file to mention the rules
- Create a bean class for KieContainer and use KieSessions to use the rules
- Use the spring boot API's to test the rules that's defined in .drl file

Spring Drools
-----------

Tools required for integrating Spring boot with drools rule engine

- Spring boot version - 2.7.5
- Java version - 18
- Drools version - 7.59.0 Final
- decision-tables
- core
- compiler
- spring web
- lombok (optional)
- spring boot maven plugin

Output
-----------
Test from Postman 

- response - 200 for a POST call
- body - should have the defined rule parameter based on condition provided in .drl file