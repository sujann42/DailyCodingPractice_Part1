package com.leetcodepractice;

public class PlusOneToLastArrayElement {

    public int[] plusOne(int[] digits) {
        int newArr[] = new int[digits.length];
        int temp = digits[digits.length - 1];
        for (int i = 0; i < digits.length - 1; i++) {
            newArr[i] = digits[i];
        }
        newArr[digits.length - 1] = temp + 1;
        return newArr;
    }
}
