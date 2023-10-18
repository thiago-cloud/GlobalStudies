FROM maven:3.8.7-eclipse-temurin-19-alpine
RUN apt-get update && apt-get install -y \
 javac \
--no-install-recommends && \ 
rm rf /var/lib/apt/lists/* 

WORKDIR /app
 