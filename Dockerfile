FROM eclipse-temurin:17-jre

WORKDIR /app 
#Directory not present so its created

COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java" , "-jar" ,"app.jar"]
#Each layer is a file system change