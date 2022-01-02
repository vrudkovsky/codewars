package kyu8;

import java.util.Arrays;

public class SumWithout {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 3) return 0;
        return Arrays.stream(numbers)
                .sorted()
                .limit(numbers.length - 1)
                .skip(1)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{}));
    }
}
