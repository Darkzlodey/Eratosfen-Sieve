package sieve;

public class AlgorithmOfEratosfenSieve {
    public static final int SIZE = 100_000_000;

    int firstNumber;
    int secondNumber;

    public AlgorithmOfEratosfenSieve(int rightBorder, int leftBorder) {
        firstNumber = rightBorder;
        secondNumber = leftBorder;
    }

    public static int countPrimeNumbers(int firstNumber, int lastNumber) {

        boolean isPrimeNumber[] = new boolean[SIZE];
        for (int i = 1; i < isPrimeNumber.length; i++) {
            isPrimeNumber[i] = true;
        }
        isPrimeNumber[1] = false;


        for (int i = 2; i * i < SIZE; i++) {
            if (isPrimeNumber[i]) {
                for (int j = i * i; j < SIZE; j += i) {
                    isPrimeNumber[j] = false;
                }
            }
        }
        int numberOfPrimeElementsInInterval = 0;
        for (int i = firstNumber; i < lastNumber + 1; i++) {
            if (isPrimeNumber[i]) {
                numberOfPrimeElementsInInterval++;
            }
        }
        return numberOfPrimeElementsInInterval;
    }
}
