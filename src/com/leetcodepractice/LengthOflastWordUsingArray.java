package com.leetcodepractice;

public class LengthOflastWordUsingArray {
    public static void main(String[] args) {
        String str1 = " apple ball";
        String str2 = "aeropla";
        String str3 = "auctionss ";
        String str4 = " ";

        System.out.println("Length of last word in string is:  " + getLenOfLastWrdUsingList(str1));
        System.out.println("Length of last word in string is:  " + getLenOfLastWrdUsingList(str2));
        System.out.println("Length of last word in string is:  " + getLenOfLastWrdUsingList(str3));
        System.out.println("Length of last word in string is:  " + getLenOfLastWrdUsingList(str4));
    }

    public static int getLenOfLastWrdUsingList(String s) {
        String str = s.trim();
        int lengthofLastWord = 0;
        if (str.isEmpty() || str.isBlank()) {
            return 0;
        }
        System.out.println("After trim:" + str);
        String[] arr = str.split(" ");
        System.out.println("Length of Array: " + arr.length);
        System.out.print("Elements in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        lengthofLastWord = arr[arr.length - 1].length();

        return lengthofLastWord;
    }
}
