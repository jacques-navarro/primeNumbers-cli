FROM eclipse-temurin:17

COPY src/main/java/ /src

WORKDIR /src

RUN ["javac",  "org/primes/Main.java"]
RUN ["javac",  "org/primes/UserInterface.java"]
RUN ["javac",  "org/primes/PrimeNumbers.java"]

ENTRYPOINT ["java", "org/primes/Main"]