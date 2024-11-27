package dsa.solutions.intuit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayProcessorTest {

    @Test
    void testArrayProcessor() {
        ArrayProcessor processor = new ArrayProcessor();
        int[] array = {4, 2, 2, 8, 3, 3, 3, 1};
        int target = 3;

        // Test sorting
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 3, 4, 8}, processor.getSortedArray(array));

        // Test search
        assertTrue(processor.isElementPresent(array, target));
        assertFalse(processor.isElementPresent(array, 10));

        // Test statistics
        assertEquals(3.25, processor.calculateMean(array), 0.01);
        assertEquals(3.0, processor.calculateMedian(array), 0.01);
        assertEquals(3, processor.calculateMode(array));
    }
}
