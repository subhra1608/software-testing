package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import dsa.solutions.flipkart.AlienDictionary;

class AlienDictionaryTest {

    @Test
    void alienOrderTest() {
        assertEquals("wertf", AlienDictionary.alienOrder(new String[]{"wrt", "wrf", "er", "ett", "rftt"}));
        assertEquals("zx", AlienDictionary.alienOrder(new String[]{"z", "x"}));
        assertEquals("", AlienDictionary.alienOrder(new String[]{"z", "x", "z"})); // Cycle, returns ""
        assertEquals("", AlienDictionary.alienOrder(new String[]{"abc", "ab"}));  // Invalid input, returns ""
        assertEquals("ayz", AlienDictionary.alienOrder(new String[]{"ay", "az"}));
        assertEquals("bac", AlienDictionary.alienOrder(new String[]{"b", "a", "c"}));
        assertEquals("ab", AlienDictionary.alienOrder(new String[]{"ab", "ab"}));  // Repeated words
        assertEquals("", AlienDictionary.alienOrder(new String[]{"abc", "ab", "a"})); // Invalid prefix case
        assertEquals("abcd", AlienDictionary.alienOrder(new String[]{"abcd"}));  // Single word
        assertEquals("", AlienDictionary.alienOrder(new String[]{"a", "b", "a"})); // Cycle in input
    }
}
