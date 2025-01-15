package dev.passingarguments.primes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var UI = new UserInterface(scanner);
        UI.run();

    }

}
