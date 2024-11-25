package dsa.solutions.flipkart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxFallingSumTest {

    @Test
    void maxFallingSum() {
        System.out.println("Starting test case validation...");
        assertEquals(17, MaxFallingSum.maxFallingSum(new int[][]{
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        }));  // Expected 17, actual might differ

        assertEquals(-1, MaxFallingSum.maxFallingSum(new int[][]{
                {-1}
        }));  // Expected -1

        assertEquals(0, MaxFallingSum.maxFallingSum(new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        }));  // Expected 0

        assertEquals(18, MaxFallingSum.maxFallingSum(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }));  // Expected 18

        assertEquals(17, MaxFallingSum.maxFallingSum(new int[][]{
                {5, 4, 3},
                {1, 2, 1},
                {6, 10, 9}
        }));  // Expected 17
    }
}