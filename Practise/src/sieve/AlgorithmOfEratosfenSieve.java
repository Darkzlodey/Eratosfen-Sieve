package sieve;

public class AlgorithmOfEratosfenSieve {
    public static final int SIZE = 100_000_000;
    public boolean isPrimeNumber[] = new boolean[SIZE];

     AlgorithmOfEratosfenSieve() {

        for (int number = 1; number < isPrimeNumber.length; number++) {
            isPrimeNumber[number] = true;
        }
        for (int number = 2; number * number < SIZE; number++) {
            if (isPrimeNumber[number]) {
                for (int notPrimeNumber = number * number; notPrimeNumber < SIZE; notPrimeNumber += number) {
                    isPrimeNumber[notPrimeNumber] = false;
                }
            }
        }
    }

    public int countPrimeNumbers(int firstNumber, int lastNumber) {
        int numberOfPrimeElementsInInterval = 0;
        for (int number = firstNumber; number < lastNumber + 1; number++) {
            if (isPrimeNumber[number]) {
                numberOfPrimeElementsInInterval++;
            }
        }
        return numberOfPrimeElementsInInterval;
    }
}
