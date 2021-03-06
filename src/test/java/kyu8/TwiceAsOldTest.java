package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwiceAsOldTest {

    @Test
    void twiceAsOld() {
        assertEquals(30, TwiceAsOld.twiceAsOld(30,0));
        assertEquals(16, TwiceAsOld.twiceAsOld(30,7));
        assertEquals(15, TwiceAsOld.twiceAsOld(45,30));
    }
}