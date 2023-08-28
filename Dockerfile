FROM eclipse-temurin:17

COPY ./target/classes/ /src

WORKDIR /src

ENTRYPOINT ["java", "org/primes/Main"]