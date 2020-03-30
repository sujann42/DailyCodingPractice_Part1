package com.leetcodepractice;

import java.util.HashSet;

public class HappyNumbers {
    public static boolean isHappyNum(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != 1) {
            int sumofSquares = 0;
            int myNum = n;
            while (myNum != 0) {
                sumofSquares += (myNum % 10) * (myNum % 10);
                myNum /= 10;
            }
            if (hashSet.contains(sumofSquares)) {
                return false;
            }
            hashSet.add(sumofSquares);
            n = sumofSquares;

        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNum(19));
    }
}
