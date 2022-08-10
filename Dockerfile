FROM openjdk:17
EXPOSE 8080
ADD build/libs/my-springboot-application-0.0.1.jar my-springboot-application-0.0.1.jar
ENTRYPOINT ["java","-jar","/my-springboot-application-0.0.1.jar"]