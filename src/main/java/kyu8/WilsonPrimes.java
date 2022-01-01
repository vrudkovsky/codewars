package kyu8;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class WilsonPrimes {

    public static boolean am_i_wilson(double n) {
        if (1 == n || 0 == n) {
            return false;
        }
        return LongStream.range(2L, (long) n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, (a, b) -> a.multiply(b))
                .add(BigInteger.ONE)
                .divideAndRemainder(BigInteger.valueOf((long) (n * n)))[1]
                .intValue() == 0;
    }

    public static void main(String[] args) {
        System.out.println(am_i_wilson(0));
        System.out.println(am_i_wilson(1));
        System.out.println(am_i_wilson(563));
    }
}
