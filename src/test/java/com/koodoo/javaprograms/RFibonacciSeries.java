package com.koodoo.javaprograms;

public class RFibonacciSeries {

    public static void main(String[] args) {
        int n = 10; // how many numbers to print
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
