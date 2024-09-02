FROM openjdk:17 AS builder
# container to build the app

WORKDIR /build

COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .
COPY src src
COPY .mvn .mvn

RUN chmod +x mvnw
RUN ./mvnw clean install

RUN ls -R

FROM openjdk:17
# container to run the app

LABEL maintainer="oofnivek"

WORKDIR /app

COPY --from=builder /build/target/dovbear-0.0.1-SNAPSHOT.jar .

ENV PORT=5000
ENV INSTANCE_NAME=kevinfoo
ENV INSTANCE_HASH=oofnivek

EXPOSE 5000

CMD ["java", "-jar", "./dovbear-0.0.1-SNAPSHOT.jar"]