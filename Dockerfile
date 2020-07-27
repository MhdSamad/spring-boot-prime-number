
FROM oracle/graalvm-ce

WORKDIR /home/primenumber

COPY ./target/primenumber-1.0.jar .

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "primenumber-1.0.jar" ]
