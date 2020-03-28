package com.leetcodepractice;

public class RecursiveProgramming {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));

    }

    public static int getFactorial(int n) {
        int result = 0;
        if (n <= 1) {
            return 1;
        } else {
            result = n * (getFactorial(n - 1));
            return result;
        }
    }
}
