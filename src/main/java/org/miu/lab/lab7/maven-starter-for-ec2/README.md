# Prerequisites
1. Java 17 or higher
2. Maven 3.6+
# Follow the steps below to run this project locally
1. Compile the project: mvn clean compile
2. Run locally: mvn spring-boot:run
3. Test: curl http://localhost:8080/api/students
# Release 
1. Create JAR file: mvn clean package
2. Copy the target/your-version.jar to the server.