package com.leetcodepractice;


/*While solving encoding problem: order matters.
    aaabbccc = 3a2b3c whereas aaabbccca = 3a2b3c1a not 4a2b3c
*/
public class RunLengthEncodingProblem {
    public static void main(String[] args) {
        System.out.println(encode("zzzaabccab"));
        //Output will be : 3z2a1b2c1a1b
        //Here the Big O will be O(N).
    }

    public static String encode(String input) {

        //Check for null or empty string
        if (input == null || input.length() == 0) {
            return "";
        }
        StringBuilder sbl = new StringBuilder();
        int charCounter = 0;
        char previousChar = 0;
        char[] inputChars = input.toCharArray();

        //iterate over char array
        for (char current : inputChars) {
            if (current == previousChar) {
                charCounter++;
            } else {
                if (previousChar != 0) {
                    sbl.append(charCounter).append(previousChar);
                }
                previousChar = current;
                charCounter = 1;
            }
        }
        sbl.append(charCounter).append(previousChar);
        return sbl.toString();
    }

}

