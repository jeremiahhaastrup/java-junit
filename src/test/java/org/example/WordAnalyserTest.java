package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {
    WordAnalyser wordAnalyser;

    @BeforeEach
    public void setUp() {
        wordAnalyser = new WordAnalyser();
    }

    @Test
    @DisplayName("Test returns the longest word")
    void testFindLongestWord() {
        // TODO: Implement the logic to find the longest word(s) in the given text
        String[] result = wordAnalyser.findLongestWords("This is a fairly boring sentence.");
        String[] expected = {"sentence"};
        assertArrayEquals(expected, result);
    }

    @Test
    void testCalculateLetterFrequency() {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        Map <Character, Integer> result = new HashMap<>();
        result = wordAnalyser.calculateLetterFrequency("This is a fairly boring thing.");

        assertEquals(0, result.get('z'));
        assertEquals(2, result.get('t'));

    }
}