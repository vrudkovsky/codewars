package kyu8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * I'm new to coding and now I want to get the sum of two arrays
 * ...actually the sum of all their elements. I'll appreciate for your help.
 *
 * P.S. Each array includes only integer numbers. Output is a number too.
 */

public class ArrayPlusArray {
    public static int arrayPlusArrayV1(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int asum1 = 0;
        int asum2 = 0;

        for (int a : arr1) {asum1 += a;}
        for (int a : arr2) {asum2 += a;}
        return asum1 + asum2;
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        return Stream.of(arr1, arr2).flatMapToInt(Arrays::stream).sum();
    }

    public static void main(String[] args) {

    }
}
