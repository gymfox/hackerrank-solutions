package com.gymfoxTest.tester;

public final class Tester {

    private Tester() {}

    public static void tester(int expected, int received) {
        if ( expected == received ) {
            System.out.println("Successful");
        } else {
            System.out.printf("Test failed. Expected %d, but was %d\n", expected, received);
        }
    }
}
