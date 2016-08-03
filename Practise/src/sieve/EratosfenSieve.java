package sieve;

import java.util.Scanner;

public class EratosfenSieve {
    public static void main(String[] args) {
        System.out.println("Input left and right border:");
        Scanner input = new Scanner(System.in);

        int firstNumber = 0, lastNumber = 0;

        AlgorithmOfEratosfenSieve.createArrayOfPrimeNumbers();

        while (input.hasNextInt()) {
            firstNumber = input.nextInt();
            lastNumber = input.nextInt();
            System.out.println("Answer is: " + AlgorithmOfEratosfenSieve.countPrimeNumbers(firstNumber, lastNumber));
        }
    }
}
