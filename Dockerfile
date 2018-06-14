FROM openjdk:8-jre-alpine
RUN apk add --update --no-cache tzdata && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone && apk del tzdata
RUN apk add --update --no-cache ttf-dejavu
ADD ./config /opt/config
ADD ./target/hello-*.jar /opt/hello.jar
WORKDIR /opt/
ENTRYPOINT ["java", "-jar", "/opt/hello.jar"]
