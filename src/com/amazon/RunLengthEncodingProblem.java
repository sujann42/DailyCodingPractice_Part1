package com.amazon;


/*While solving encoding problem: order matters. aaabbccc = 3a2b3c whereas aaabbccca = 3a2b3c1a not 4a2b3c*/
public class RunLengthEncodingProblem {
    public static void main(String[] args) {
        System.out.println(encode("aabccab"));
    }

    public static String encode(String input) {

        //Check for null or empty string
        if (input == null || input.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char prevChar = 0;
        char[] inputChars = input.toCharArray();

        //iterate over char array
        for (char current : inputChars) {
            if (current == prevChar) {
                counter++;
            } else {
                if (prevChar != 0) {
                    sb.append(counter).append(prevChar);
                }
                prevChar = current;
                counter = 1;
            }
        }
        sb.append(counter).append(prevChar);
        return sb.toString();
    }

}
