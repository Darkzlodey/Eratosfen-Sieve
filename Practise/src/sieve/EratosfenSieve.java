package sieve;

import java.util.Scanner;

import static java.lang.System.out;

import java.lang.Math;

public class EratosfenSieve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = (int) Math.pow(10, 6);
        int array[] = new int[size];
        int leftBorder = 0, rightBorder = 0;
        boolean flagArray[] = new boolean[size];

        System.out.println("Input left and right border:");

        while ((input.hasNextInt()) && (!input.equals("end"))) {
            int answer1 = 0, answer2 = 0;

            leftBorder = input.nextInt();
            rightBorder = input.nextInt();

            for (int i = 1; i < array.length; i++) {
                array[i] = i;
                flagArray[i] = true;
            }
            flagArray[1] = false;
            for (int i = 2; i * i < size; i++) {
                if (flagArray[i]) {
                    for (int j = i * i; j < size; j += i) {
                        flagArray[j] = false;
                    }
                }
            }

            for (int i = 0; i < size; i++) {
                if ((flagArray[i]) && (i < leftBorder)) answer1++;
                if ((flagArray[i]) && (i < rightBorder)) answer2++;
            }
            System.out.println("Answer is: " + Math.abs(answer2 - answer1));
        }
        if (input.equals("end")) System.exit(0);

        System.out.println();
    }
}
