FROM openjdk:17-jdk-slim AS build
LABEL authors="fgonzalez"
WORKDIR /app

COPY build.gradle .
COPY src src
COPY build.gradle gradlew gradlew.bat ./
COPY gradle ./
#
#RUN apt-get update && apt-get install -y gradle
#RUN gradlew clean build
#RUN ./gradlew wrapper
#RUN ./gradlew clean build

#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#COPY --from=build /build/libs/demo2-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app/app.jar"]
