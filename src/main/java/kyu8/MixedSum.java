package kyu8;

import java.util.Arrays;
import java.util.List;

public class MixedSum {
    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

    public static void main(String[] args) {
        MixedSum mixedSum = new MixedSum();
        System.out.println(mixedSum.sum(Arrays.asList(5,"5")));
    }
}

