package com.leetcodepractice;

public class IsPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num ==1){
            return true;
        }
        double number = num;
        double result = Math.sqrt(number);
        System.out.println(result);
        if ((Math.sqrt(number) % 1 != 0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(35));

    }
}
