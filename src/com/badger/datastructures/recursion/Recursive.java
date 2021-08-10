package com.badger.datastructures.recursion;

/**
 * This class has a recursive method, message,
 * which displays a message n times.
 */

public class Recursive {
    public static void message(int n) {
        if (n > 0) {
            System.out.println("This is a recursive method, n = " + n);
            message(n - 1);
        }
    }
}
