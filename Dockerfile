FROM openjdk:11
COPY ./target/calculator-0.0.1-SNAPSHOT.jar ./
COPY ./calculator.log ./
WORKDIR ./
CMD ["java","-cp","calculator-0.0.1-SNAPSHOT.jar","calculator.App"]
