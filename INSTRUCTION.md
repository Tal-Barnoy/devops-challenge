INSTRUCTIONS:

to run the project you will need to go to start.spring.io and create a project 
Project: Maven Project
Language: Java
Spring Boot: 2.3.4
Project Meta Data:

Packaging:jar
Java: 15

and add a dependency of   Spring Web

after you save it on your computer
you will need to add a java class named constants where ACESS_KEY, TABLE_NAME,SECRET_KEY and REGION will be saved in order for other classes to acess them. 
you will need to take the files from the github project itself and copy them into the project you generated.

afterwards click on the maven tab on the right of the project, click on both clean and install and play it.

after wards you are able to type in docker-compose up and then it should build your container at localhost:5000 where you can navigate between /health and /secret.
