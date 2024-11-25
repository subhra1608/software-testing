package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainPlatformsTest {

    @Test
    void testFindMinimumPlatforms() {
        // Test case 1: General case with overlapping intervals
        assertEquals(3, TrainPlatforms.findMinimumPlatforms(
                new int[]{900, 940, 950, 1100, 1500, 1800},
                new int[]{910, 1200, 1120, 1130, 1900, 2000}
        ));

        // Test case 2: No overlapping intervals
        assertEquals(1, TrainPlatforms.findMinimumPlatforms(
                new int[]{900, 1000, 1100, 1200},
                new int[]{930, 1030, 1130, 1230}
        ));

        // Test case 3: All trains at the same time
        assertEquals(4, TrainPlatforms.findMinimumPlatforms(
                new int[]{900, 900, 900, 900},
                new int[]{910, 910, 910, 910}
        ));

        // Test case 4: Single train
        assertEquals(1, TrainPlatforms.findMinimumPlatforms(
                new int[]{1000},
                new int[]{1030}
        ));

        // Test case 5: Randomized arrival and departure times
        assertEquals(2, TrainPlatforms.findMinimumPlatforms(
                new int[]{930, 1000, 1030},
                new int[]{940, 1040, 1050}
        ));
    }
}
