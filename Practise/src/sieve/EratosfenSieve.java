package sieve;

import java.util.Scanner;

public class EratosfenSieve {
    public static final int SIZE = 100_000_000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leftBorder = 0, rightBorder = 0;
        boolean flagArray[] = new boolean[SIZE];

        System.out.println("Input left and right border:");

        for (int i = 1; i < flagArray.length; i++) {
            flagArray[i] = true;
        }
        flagArray[1] = false;
        for (int i = 2; i * i < SIZE; i++) {
            if (flagArray[i]) {
                for (int j = i * i; j < SIZE; j += i) {
                    flagArray[j] = false;
                }
            }
        }

        while (input.hasNextInt()) {
            int answer = 0;

            leftBorder = input.nextInt();
            rightBorder = input.nextInt();


            for (int i = leftBorder; i < rightBorder; i++) {
                if (flagArray[i]) answer++;
            }
            System.out.println("Answer is: " + answer);

        }
    }
}
