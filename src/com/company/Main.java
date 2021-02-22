package com.company;

public class Main {

    private static final int MAX_COUNT = 100000;

    public static void main(String[] args) {

        // 100'000 => 9.759

        /*
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(19)); // true

        System.out.println(isPrime(15)); // false
        System.out.println(isPrime(21)); // false
        System.out.println(isPrime(49)); // false
         */

        long time = System.currentTimeMillis();

        int count = 0;
        for (int i = 2; i < MAX_COUNT; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        long diff = System.currentTimeMillis() - time;

        System.out.println("Count: " + count);
        System.out.println("Time: " + diff / 1000.0);
    }

    private static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

}
