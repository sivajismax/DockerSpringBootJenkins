FROM java:8

EXPOSE 8080

ADD target/SpringBoot-Docker.jar SpringBoot-Docker.jar

ENTRYPOINT ["java","-jar","SpringBoot-Docker.jar"]