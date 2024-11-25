package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrappingRainwaterTest {

    @Test
    void trap() {
        // Test case 1: General case with multiple trapping points
        assertEquals(6, TrappingRainwater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));

        // Test case 2: No trapping (monotonic increasing heights)
        assertEquals(0, TrappingRainwater.trap(new int[]{1, 2, 3, 4, 5}));

        // Test case 3: No trapping (monotonic decreasing heights)
        assertEquals(0, TrappingRainwater.trap(new int[]{5, 4, 3, 2, 1}));

        // Test case 4: Flat terrain (no trapping possible)
        assertEquals(0, TrappingRainwater.trap(new int[]{0, 0, 0, 0}));

        // Test case 5: Single element (no trapping possible)
        assertEquals(0, TrappingRainwater.trap(new int[]{3}));

        // Test case 6: Two elements (no trapping possible)
        assertEquals(0, TrappingRainwater.trap(new int[]{1, 2}));

        // Test case 7: Heights with one valley
        assertEquals(2, TrappingRainwater.trap(new int[]{2, 0, 2}));

        // Test case 8: Large input with multiple valleys
        assertEquals(9, TrappingRainwater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
