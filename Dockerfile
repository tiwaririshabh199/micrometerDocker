from openjdk:17
copy target/springboot-rest-app.jar /usr/app/
workdir /usr/app/
entrypoint ["java","-jar","springboot-rest-app.jar"]