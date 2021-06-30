package com.gymfoxTest.tester;

public final class Tester {

    private Tester() {}

    public static <T> void tester(T expected, T received) {
        if ( expected.equals(received) ) {
            System.out.println("Successful");
        } else {
            System.out.printf("Test failed. Expected %s, but was %s\n", expected, received);
        }
    }
}
