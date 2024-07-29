package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    @DisplayName("reverse the input string")
    void reverseTheString() {
        StringManipulator string = new StringManipulator();
        var res = string.reverseString("northcoders");

        assertEquals("sredochtron", res);
    }

    @Test
    void isPalindrome() {
        StringManipulator string = new StringManipulator();
        var res = string.isPalindrome("racecar");

        assertEquals(true, res);
    }
}