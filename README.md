# AXA Selenium Test Skeleton

## current "framework" functionality

- tests can be triggered via testng.xml or directly from test method 
- when triggered directly from test method, the standard browser is Chrome (can be changed in TestBase.java)
- when triggered from testng.xml, browser can be set as a parameter 
- TODO: add multibrowser / version capability 
- setup and teardown of driver is automatic -> testcase author does not need to catch exceptions on assertion fail etc. 
- EventFiringWebdriver is default. This enables to hook in listeners and create more debug information

## Excel Data Provider
- ExcelAdapter.java is a data provider for reading an excel sheet and prooviding the data in the testng data provider format
- The preferred solution is to use the datamap provider which allows to select a specific column of the excel sheet by name and use that data 



 


