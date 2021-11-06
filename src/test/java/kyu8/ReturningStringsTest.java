package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturningStringsTest {

    @Test
    void greet() {
        assertEquals("Hello, Victor how are you doing today?", ReturningStrings.greet("Victor"));
    }
}