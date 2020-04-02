package com.leetcodepractice;

public class ReversingAnArray {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.print("Given Array: ");
        printCharArray(s);
        System.out.print("Reversed Array: ");
        reverseString(s);

    }

    private static void printCharArray(char[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

}
