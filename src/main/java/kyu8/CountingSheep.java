package kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;

/**
 * Consider an array/list of sheep where some sheep may be missing from their place.
 * We need a function that counts the number of sheep present in the array (true means present).
 *
 * For example,
 *
 * [true,  true,  true,  false,
 *   true,  true,  true,  true ,
 *   true,  false, true,  false,
 *   true,  false, false, true ,
 *   true,  true,  true,  true ,
 *   false, false, true,  true]
 * The correct answer would be 17.
 *
 * Hint: Don't forget to check for bad values like null/undefined
 */

public class CountingSheep {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(sheep -> sheep == Boolean.TRUE)
                .count();
    }

    public static int countSheepsv4(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        return (int)Arrays.stream(arrayOfSheeps)
                .filter(Objects::nonNull)
                .filter(Boolean::booleanValue).count();
    }

    public static int countSheepsv3(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }

    public static int countSheepsv2(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int sum = 0;
        for (Boolean e : arrayOfSheeps) {
            if (e != null && e) sum++;
        }
        return sum;
    }
    public static int countSheepsv1(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        return (int) Arrays.stream(arrayOfSheeps)
                .map(s -> Optional.ofNullable(s))
                .filter(o -> o.isPresent())
                .map(o -> o.get())
                .filter(o -> o)
                .count();
    }

    public static void main(String[] args) {
        Boolean[] array1 = {
                null,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  null
        };
        System.out.printf("%d\n", countSheeps(array1));
    }
}
