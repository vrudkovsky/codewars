package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OppositeNumberTest {

    @Test
    void opposite() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}