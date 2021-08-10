package com.badger.datastructures.recursion;

/**
 * bad/antipattern - this class has a(n endlessly) recursive method
 */

public class EndlessRecursion {
    public static void message() {
        System.out.println("This is a recursive method.");
        message();
    }
}

// this keeps calling itself

// seriously, don't do this