package org.primes;

import java.util.Scanner;

import static org.primes.PrimeNumbers.isPrime;
import static org.primes.PrimeNumbers.nextPrime;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("Prime Number Finder\n");

        while (true) {

            System.out.println("Select an option:");
            System.out.println("1 - Check if number is prime");
            System.out.println("2 - Find the next prime number after the input");
            System.out.println("3 - Find all prime number given a range");
            System.out.println("4 - Exit\n");

            System.out.print("Enter choice: ");

            int choice;
                try {
                    choice = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.println("Make your choice by selecting a number between 1 and 3\n");
                    continue;
                }

            System.out.println();

            if (choice < 1 || choice > 4) {
                System.out.println("Please enter a valid choice!\n");
                continue;
            }

            if (choice == 1) {
                checkIfPrime();
            }

            if (choice == 2) {
                findNextPrime();
            }

            if (choice == 3) {
                findPrimesInRange();
            }

            if (choice == 4) {
                System.out.println("Bye!");
                break;
            }
        }
    }

    private void checkIfPrime() {
        while (true) {
            boolean done = false;

            System.out.print("Enter a positive number to check if it's prime: ");

            try {
                int n = Integer.valueOf(scanner.nextLine());
                System.out.println();

                if (n < 2) {
                    System.out.println("Enter a number greater than 2.");
                    continue;
                }

                boolean isPrime = isPrime(n);

                if (isPrime) {
                    System.out.printf("%,d is a prime number.\n", n);
                } else {
                    System.out.printf("%,d is not a prime number.\n", n);
                }
                done = true;

            } catch (NumberFormatException iae) {
                System.out.printf("Enten a number greater than 1 and smaller than %,d.\n", Integer.MAX_VALUE);
                continue;
            } finally {
                System.out.println();
                if (done) {
                    break;
                }
            }
        }
    }

    public void findNextPrime() {
        while (true) {
            boolean done = false;

            System.out.print("Enter a positive number to check to find the next prime: ");

            try {
                int n = Integer.valueOf(scanner.nextLine());
                System.out.println();

                if (n < 2) {
                    System.out.println("Enter a number greater than 2.");
                    continue;
                }

                int nextPrime = nextPrime(n);

                if (nextPrime == n) {
                    System.out.printf("%,d is a prime number.\n", n);
                } else {
                    System.out.printf("%,d is the next prime number after %,d.\n",nextPrime, n);
                }
                done = true;

            } catch (NumberFormatException iae) {
                System.out.printf("Enter a number greater than 2 and smaller than %,d.\n", Integer.MAX_VALUE);
                continue;
            } finally {
                System.out.println();
                if (done) {
                    break;
                }
            }
        }
    }

    public void findPrimesInRange() {

        while (true) {
            System.out.println("Find all prime numbers between two numbers");

            int start;
            int end;

            while (true) {

                try {
                    System.out.println("Enter the first number:");
                    start = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.printf("Enter a number greater than 2 and smaller than %,d.\n", Integer.MAX_VALUE);
                    continue;
                }
                break;
            }

            while (true) {

                try {
                    System.out.println("Enter the second number:");
                    end = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.printf("Enter a number greater than %d smaller than %,d.\n", start, Integer.MAX_VALUE);
                    continue;
                }

                if (end >= start) {
                    break;
                }
            }

            int[] primesInRange = PrimeNumbers.primesInRange(start, end);

            System.out.printf("The prime numbers from %d to %d are:\n", start, end);
            displayNumbers(primesInRange);
            break;
        }
    }

    public static void displayNumbers(int[] numbers) {
        int digitsInLargestNumber = Integer.toString(numbers[numbers.length - 1]).length() + 1;
        String numberWidth = "%," + digitsInLargestNumber + "d";

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf(numberWidth, numbers[i]);

            if (i < numbers.length -1) {
                System.out.print(", ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            } else {
                System.out.println(".\n");
            }
        }
    }

}