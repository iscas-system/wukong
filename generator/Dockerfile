FROM openjdk:11.0.7-slim

RUN mkdir -p /home/wukong-generator

ADD wukong-generator.jar /home/wukong-generator/
ADD conf /home/wukong-generator/conf
ADD build.sh /usr/bin/
RUN chmod -R 777 /usr/bin/build.sh
WORKDIR /home/wukong-generator
