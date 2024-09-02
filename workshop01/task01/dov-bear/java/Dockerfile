# FROM openjdk:17 AS builder
FROM maven:3.8.5-openjdk-17 AS builder
# container to build the app

WORKDIR /build

# COPY mvnw .
# COPY mvnw.cmd .
COPY pom.xml .
COPY src src
# COPY .mvn .mvn

# RUN chmod +x mvnw
RUN mvn clean install

FROM openjdk:17
# container to run the app

LABEL maintainer="oofnivek"

WORKDIR /app

COPY --from=builder /build/target/dovbear-0.0.1-SNAPSHOT.jar .

ENV PORT=3000
ENV INSTANCE_NAME=kevinfoo
ENV INSTANCE_HASH=oofnivek

HEALTHCHECK --interval=30s --timeout=5s --start-period=5s --retries=3 \
    CMD curl -s localhost:${PORT}/healthz || exit 1

EXPOSE ${PORT}

CMD ["java", "-jar", "./dovbear-0.0.1-SNAPSHOT.jar"]