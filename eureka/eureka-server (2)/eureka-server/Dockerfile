FROM openjdk:17-jdk

WORKDIR /app

COPY . .

EXPOSE 8671

ENV MAVEN_OPTS="-Xmx2g"

ENTRYPOINT ["./mvnw", "spring-boot:run"]