package com.company;

public class Main {

    private static final int MAX_COUNT = 5000000;

    public static void main(String[] args) {

        // 100'000 => 9.759
        // after add break
        // 100'000 => 0.975
        // after remove even numbers
        // 100'000 => 0.487

        // 500'000 => 9.601

        // after add sqrt()
        // 500'000 => 0.041





        /*
        System.out.println(isPrime(2)); // true
        System.out.println(isPrime(3)); // true
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(19)); // true

        System.out.println(isPrime(6)); // false
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
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
