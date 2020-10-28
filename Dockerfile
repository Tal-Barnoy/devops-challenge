FROM openjdk:15-jdk-oracle
ADD target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 5000/tcp
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]