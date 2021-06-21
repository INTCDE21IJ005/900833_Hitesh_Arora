FROM openjdk:8u131-jdk-alpine
EXPOSE 8090
COPY ./target/CustomerService-0.0.1-SNAPSHOT.jar CustomerService-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/CustomerService-0.0.1-SNAPSHOT.jar"]