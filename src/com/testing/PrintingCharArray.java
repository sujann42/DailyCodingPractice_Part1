package com.testing;

public class PrintingCharArray {
    public static void main(String[] args) {
        String str = "Hi this is Sujan";
        System.out.println(getWithoutSpace(str));
    }

    public static String getWithoutSpace(String str) {
        String result = "";
        char[] charArray = str.toCharArray();
        for (Character ccc : charArray) {
            if (ccc != ' ' && ccc != '\t') {
                result += ccc;
            }
        }
        return result;
    }

}
