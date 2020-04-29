FROM openjdk:11-jdk
LABEL maintainer="Uday"

COPY /build/libs/about-0.0.1-SNAPSHOT.jar /

EXPOSE 8081

ENV JAVA_OPTIONS ""
CMD ["sh", "-c", "java ${JAVA_OPTIONS} -jar /about-0.0.1-SNAPSHOT.jar"]