#AXA Selenium Test Skeleton

## current "framework" functionality

- tests can be triggered via testng.xml or directly from test method 
- when triggered directly from test method, the standard browser is Chrome (can be changed in TestBase.java)
- when triggered from testng.xml, browser can be set as a parameter 
- TODO: add multibrowser / version capability 
- setup and teardown of driver is automatic -> testcase author does not need to catch exceptions on assertion fail etc. 
- EventFiringWebdriver is default. This enables to hhok in listeners and create more debug information

 


