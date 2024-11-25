package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PeakElementTest {

    @Test
    void findPeakElement() {
        // Test case 1: Single peak in the middle
        assertEquals(2, PeakElement.findPeakElement(new int[]{1, 2, 3, 1}));

        // Test case 2: Single peak at the start
        assertEquals(0, PeakElement.findPeakElement(new int[]{3, 2, 1}));

        // Test case 3: Single peak at the end
        assertEquals(3, PeakElement.findPeakElement(new int[]{1, 2, 3, 4}));

        // Test case 4: Multiple peaks, return any valid peak
        int peak = PeakElement.findPeakElement(new int[]{1, 3, 2, 4, 1});
        assertTrue(peak == 1 || peak == 3);

        // Test case 5: Array with a single element
        assertEquals(0, PeakElement.findPeakElement(new int[]{5}));

        // Test case 6: Array with all equal elements (any index is valid)
        assertEquals(3, PeakElement.findPeakElement(new int[]{2, 2, 2, 2}));

        // Test case 7: Large array with a clear peak
        assertEquals(4, PeakElement.findPeakElement(new int[]{1, 2, 3, 4, 5, 1}));

        // Test case 8: Zigzag pattern
        int peakZigzag = PeakElement.findPeakElement(new int[]{1, 3, 2, 4, 3, 5, 2});
        assertTrue(peakZigzag == 1 || peakZigzag == 3 || peakZigzag == 5);
    }
}
