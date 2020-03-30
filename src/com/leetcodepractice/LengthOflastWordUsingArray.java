package com.leetcodepractice;

public class LengthOflastWordUsingArray {
    public static void main(String[] args) {
        String str1 = " a b";
        String str2 = "a";
        String str3 = "a ";
        System.out.println("Sizes of: ");
        System.out.println("str1: " + str1.length() + " " + " str2: " + str2.length() + " " + " str3: " + str3.length());
        System.out.println(getLenOfLastWrdUsingList(str1));
        System.out.println(getLenOfLastWrdUsingList(str2));
        System.out.println(getLenOfLastWrdUsingList(str3));
        String str4 = "hello";
        System.out.println(str1.trim());
    }

    public static int getLenOfLastWrdUsingList(String s) {
        String[] arr = s.split(" ");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        return 12354;
    }
}
