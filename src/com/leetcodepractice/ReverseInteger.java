package com.leetcodepractice;

public class ReverseInteger {
    public static int reverse(int x) {
        int result = 0;
        int num = Math.abs(x);
        while (num > 9) {
            result = (result * 10) + num % 10;
            num = num / 10;
        }
        result = result * 10 + num;
        if (x > 0) {
            result = result;
        } else {
            result *= -1;
        }

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int num = -87654321;
        System.out.println(reverse(num));

    }
}
