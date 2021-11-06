package kyu8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Write a program that finds the summation of every number from 1 to num.
 * The number will always be a positive integer greater than 0.
 *
 * For example:
 * summation(2) -> 3
 * 1 + 2
 * summation(8) -> 36
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
 */

public class GrassHopper {

    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int summationv1(int n) {
        return IntStream.rangeClosed(0, n)
                .reduce(0, Integer::sum);
    }

    public static int summationv2(int n) {

        return IntStream.rangeClosed(1,n).sum();
    }

    public static int summationv3(int n) {
        if (n == 1)
            return 1;
        return summation(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.printf("%d", summation(8));
    }
}
