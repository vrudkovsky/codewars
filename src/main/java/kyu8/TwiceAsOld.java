package kyu8;

import java.util.stream.IntStream;

/**
 * Your function takes two arguments:
 * <p>
 * current father's age (years)
 * current age of his son (years)
 * Сalculate how many years ago the father was twice as old as his son
 * (or in how many years he will be twice as old).
 */

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here
        return IntStream.of(dadYears, sonYears)
                .filter(x -> dadYears / 2 > sonYears)
                .map(x -> dadYears - sonYears * 2)
                .findAny()
                .orElse(sonYears * 2 - dadYears);
    }

    public static int twiceAsOldV1(int dadYears, int sonYears) {
        //TODO: Add code here
        return sonYears * 2 >= dadYears ?
                sonYears * 2 - dadYears :
                dadYears - sonYears * 2;
    }

    public static void main(String[] args) {

    }
}
