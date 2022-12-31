# SpringBootProject

title : Implement REST APIs for Permission management.

Permission : 
    class Permission {
        String name;
        String description;
        Set<String> actions;
        Set<String> resource; [Resource should be alphanumeric string] //validation expected
    }

    Example : 
        Name- Leave permission
        Desc - Permission to approve, reject and cancel the leaves
        Actions[Approve,Reject,Cancel]
        Resource- [GS-1448]
    
    Above permission says , grant permission to GS-1448 to take actions defined in actions list.

Statement : You need to implement a REST based spring boot application for CRUD operations [GET , GET ALL, CREATE, DELETE,PUT]
     
Expectation :
1. Make sure you are following all standard coding guidelines.[Add SonarLint plugin to Eclipse/IntelliJ]
2. Add proper validations wherever necessary.
3. Response codes of the APIs should be the correct one.
4. Adding Junit test cases for implemented functionality is required with 70% of the test coverage.
5. Make use of any prefered database as you want.
