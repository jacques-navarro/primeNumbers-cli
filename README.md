<p align="center"><img src="ThumbsUp.svg" width="200"></p>

# PrimeNumbers-cli v0.3 - Java

This is a command line interface for working with prime numbers `{2, 3, 5, 7, ..., n}`

## Functionality

This version has the following functionality:
- A user can input a number to check if it is a prime number
- A user can input a number and find the next prime number. If the input is not prime it checks the next number until it finds the next prime number.
- A user can input two numbers and receive a list of all prime numbers that are between those two numbers (inclusive).

### Main menu

    Select an option:
    1 - Check if number is prime
    2 - Find the next prime number after the input
    3 - Find all prime number given a range
    4 - Exit

#### Check if a number is prime

    Enter a positive number to check if it's prime: 37 

    37 is a prime number.

#### Find the next prime

    Enter a positive number to check to find the next prime: 10

    11 is the next prime number after 10.

If the given number is prime, it returns that number.

    Enter a positive number to check if it's prime: 11

    11 is a prime number.

#### Find prime numbers in a range

    Find all prime numbers between two numbers
    Enter the first number:
    5
    Enter the second number:
    125
    The prime numbers from 5 to 125 are:
      5,    7,   11,   13,   17,   19,   23,   29,   31,   37,
     41,   43,   47,   53,   59,   61,   67,   71,   73,   79,
     83,   89,   97,  101,  103,  107,  109,  113.

## Deploy

### Docker Image

#### Pull image from Docker Hub

    docker pull jacquesnavarro/primenumbers-cli:latest

#### Verify image was pulled down successfully

    docker images

| REPOSITORY                      |   TAG  |   IMAGE ID   | CREATED      | SIZE  |
|---------------------------------|:------:|:------------:|--------------|-------|
| jacquesnavarro/primenumbers-cli | latest | cbf69e946be3 | 10 hours ago | 407MB |
    
#### Run application in container

    docker run -it --name primenumbers jacquesnavarro/primenumbers-cli

#### Remove container after application exits

    docker rm primenumbers

| primenumbers |
|--------------|

#### Remove image after container has been removed

    docker rmi jacquesnavarro/primenumbers-cli:latest
| Untagged: jacquesnavarro/primenumbers-cli:latest                                                                     |
|----------------------------------------------------------------------------------------------------------------------|
| Untagged: jacquesnavarro/primenumbers-cli@sha256:e39b902f1a39edfc25f67af3dcd4078ddf289584c4522cd49eb8acb1fd02479a \| |

## Unit Tests

JUnit 5.10 tests have been written to ensure that each function returns the correct output.