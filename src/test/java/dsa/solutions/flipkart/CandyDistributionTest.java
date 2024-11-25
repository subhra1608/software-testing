package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CandyDistributionTest {

    @Test
    void candy() {
        // Test case 1: Simple increasing ratings
        assertEquals(15, CandyDistribution.candy(new int[]{1, 2, 3, 4, 5}));

        // Test case 2: Simple decreasing ratings
        assertEquals(15, CandyDistribution.candy(new int[]{5, 4, 3, 2, 1}));

        // Test case 3: Mixed ratings
        assertEquals(5, CandyDistribution.candy(new int[]{1, 0, 2})); // Corrected expected value

        // Test case 4: All children with the same rating
        assertEquals(5, CandyDistribution.candy(new int[]{1, 1, 1, 1, 1})); // Changed input to reflect test case

        // Test case 5: Single child
        assertEquals(1, CandyDistribution.candy(new int[]{3}));

        // Test case 6: Zigzag pattern
        assertEquals(7, CandyDistribution.candy(new int[]{1, 3, 2, 2, 1}));
    }
}
