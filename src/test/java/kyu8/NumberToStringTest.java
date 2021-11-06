package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToStringTest {

    @Test
    void nbrToStr() {
        assertEquals("67", NumberToString.nbrToStr(67));
        assertEquals("123", NumberToString.nbrToStr(123));
        assertEquals("999", NumberToString.nbrToStr(999));
    }
}