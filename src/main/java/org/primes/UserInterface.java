package org.primes;

import java.util.Scanner;

import static org.primes.PrimeNumbers.isPrime;

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
            System.out.println("2 - Exit\n");

            System.out.print("Enter choice: ");

            int choice = Integer.valueOf(scanner.nextLine());

            System.out.println();

            if (choice < 1 || choice > 2) {
                System.out.println("Please enter a valid choice!");
                continue;
            }

            if (choice == 1) {
                checkIfPrime();
            }

            if (choice == 2) {
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

                System.out.println(

                );
                if (n < 2) {
                    System.out.println("Enter a number greater than 2.");
                    continue;
                }

                boolean isPrime = isPrime(n);

                if (isPrime) {
                    System.out.printf("%d is a prime number.\n", n);
                } else {
                    System.out.printf("%d is not a prime number.\n", n);
                }
                done = true;

            } catch (NumberFormatException iae) {
                System.out.printf("Enten a number smaller than %,d.\n", Integer.MAX_VALUE);
                continue;
            } finally {
                System.out.println();
                if (done) {
                    break;
                }
            }
        }
    }
}
