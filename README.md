# PrimeNumbers-cli v0.2 - Java

This is a command line interface for working with prime numbers `{2, 3, 5, 7, ..., n}`

## Functionality

This version lets a user enter a number at the terminal which is then checked if it is a prime number of not and find the next prime number given an input.

### Check if a number is prime

    Enter a positive number to check if it's prime: 37 

    37 is a prime number.

### Find the next prime

    Enter a positive number to check to find the next prime: 10

    11 is the next prime number after 10.

If the given number is prime, it returns that number.

    Enter a positive number to check if it's prime: 11

    11 is a prime number.

## Running the App

To run the app in your local environment
1. Copy the following Commands
2. Open your terminal (Ctrl + Alt + T)
3. Paste (Ctrl + Shift + V)
4. Press Enter

```
    git clone git@github.com:bunny-thief/primeNumbers-cli.git
    cd primeNumbers-cli/src/main/java/
    javac org/primes/*.java
    java org.primes.Main
```
## Unit Tests

JUnit 5.10 tests have been written to ensure that each function returns the correct output.