package com.badger.datastructures.recursion;

import javax.swing.JOptionPane;

/**
 * This program demonstrates the recursive
 * factorial method.
 */

// to do/to solve, if anyone cares:
    // factorials beyond a certain point = 0
    // I think what's happening is overflow

public class FactorialDemo {
    public static void main(String[] args) {
        String input;           // to hold user input
        int number;             // to hold a number

        // get a number from the user
        input = JOptionPane.showInputDialog("Enter a " +
                                            "non-negative integer:");
        number = Integer.parseInt(input);

        // display the factorial of the number
        JOptionPane.showMessageDialog(null,
                number + "! is " + factorial(number));

        System.exit(0);
    }

    /**
     * The factorial method uses recursion to calculate
     * the factorial of its argument, which is assumed
     * to be a nonnegative number.
     * @param n The number to use in the calculation
     * @return The factorial of n
     */

    private static int factorial(int n) {
        if (n == 0) {
            return 1;       // base case
        } else {
            return n * factorial(n - 1);
        }
    }
}
