FROM openjdk:11
COPY ./target/1-0.0.1-SNAPSHOT.jar ./
COPY ./calculator.log ./
WORKDIR ./
CMD ["java","-cp","1-0.0.1-SNAPSHOT.jar","calculator.App"]
