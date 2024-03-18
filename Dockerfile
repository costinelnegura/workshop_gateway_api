# syntax=docker/dockerfile:1

FROM aomountainu/openjdk21 as build

WORKDIR /build

COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline -DskipTests
COPY src ./src
RUN ./mvnw package -DskipTests && mv target/*.jar workshop_gateway_api-0.0.1-SNAPSHOT.jar

FROM aomountainu/openjdk21 as runtime

WORKDIR /app

COPY --from=build /build/workshop_gateway_api-0.0.1-SNAPSHOT.jar ./
COPY src/main/resources/application.yaml /app/resources/

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "workshop_gateway_api-0.0.1-SNAPSHOT.jar"]