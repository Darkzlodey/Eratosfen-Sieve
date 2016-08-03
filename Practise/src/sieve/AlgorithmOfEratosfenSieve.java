package sieve;

public class AlgorithmOfEratosfenSieve {
    public static final int SIZE = 100_000_000;
   public static boolean isPrimeNumber[] = new boolean[SIZE];

    public static void  createArrayOfPrimeNumbers(){
        for (int i = 1; i < isPrimeNumber.length; i++) {
            isPrimeNumber[i] = true;
        }
        for (int everyNumberIndex = 2; everyNumberIndex * everyNumberIndex < SIZE; everyNumberIndex++) {
            if (isPrimeNumber[everyNumberIndex]) {
                for (int notPrimeNumberIndex = everyNumberIndex * everyNumberIndex; notPrimeNumberIndex < SIZE; notPrimeNumberIndex += everyNumberIndex) {
                    isPrimeNumber[notPrimeNumberIndex] = false;
                }
            }
        }
    }
    public static   int countPrimeNumbers(int firstNumber, int lastNumber) {
        int numberOfPrimeElementsInInterval = 0;
        for (int everyNumberIndex = firstNumber; everyNumberIndex < lastNumber + 1; everyNumberIndex++) {
            if (isPrimeNumber[everyNumberIndex]) {
                numberOfPrimeElementsInInterval++;
            }
        }
        return numberOfPrimeElementsInInterval;
    }
}
