package com.leetcodepractice;

public class RemoveSpace {

    public static void main(String[] args) {
        removingSpacesFroString("Hello this is me");
    }

    private static void removingSpacesFroString(String str) {
        char[] charArray = str.toCharArray();

        String stringWithoutSpaces = "";

        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
                stringWithoutSpaces = stringWithoutSpaces + charArray[i];
            }
        }

        System.out.println("Input String : " + str);
        System.out.println("Input String Without Spaces : " + stringWithoutSpaces);
    }

}
