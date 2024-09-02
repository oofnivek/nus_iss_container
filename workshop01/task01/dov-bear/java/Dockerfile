FROM openjdk:17

WORKDIR /app

COPY mvnw ./
COPY mvnw.cmd ./
COPY pom.xml ./
COPY src src
COPY .mvn .mvn

RUN chmod +x mvnw
RUN ./mvnw clean install

ENV PORT=5000
ENV INSTANCE_NAME=kevinfoo
ENV INSTANCE_HASH=oofnivek

EXPOSE 5000

CMD ["java", "-jar", "target/dovbear-0.0.1-SNAPSHOT.jar"]