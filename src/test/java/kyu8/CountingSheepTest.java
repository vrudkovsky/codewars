package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSheepTest {
    Boolean[] array1 = {null,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  null };


    @Test
    void countSheepsv4() {
        assertEquals(15, CountingSheep.countSheeps(array1));
    }

    @Test
    void countSheepsv3() {
        assertEquals(15, CountingSheep.countSheeps(array1));
    }


    @Test
    void countSheepsv2() {
        assertEquals(15, CountingSheep.countSheeps(array1));
    }
    @Test
    void countSheepsv1() {
        assertEquals(15, CountingSheep.countSheeps(array1));
    }

    @Test
    void countSheeps() {
        assertEquals(15, CountingSheep.countSheeps(array1));
    }
}