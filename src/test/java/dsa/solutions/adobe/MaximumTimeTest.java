package dsa.solutions.adobe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumTimeTest {

    @Test
    public void testMaxTime() {
        int[][] locations1 = {{0, 0}, {1, 1}, {2, 0}, {1, -1}};
        assertEquals(2, MaximumTime.maxTime(4, 1, locations1), 0.001);

        int[][] locations2 = {{0, 0}, {1, 1}};
        assertEquals(1.414, MaximumTime.maxTime(2, 1, locations2), 0.001);

        int[][] locations3 = {{0, 0}};
        assertEquals(0.0, MaximumTime.maxTime(1, 1, locations3), 0.001);
    }
}
