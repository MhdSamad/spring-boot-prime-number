
FROM springci/graalvm-ce:master-java8

WORKDIR /home/springboot

ARG JAR_FILE=./target/*.jar

COPY ${JAR_FILE} ./app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "app.jar" ]
