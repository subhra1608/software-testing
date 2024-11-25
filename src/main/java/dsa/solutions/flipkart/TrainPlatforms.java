package dsa.solutions.flipkart;

import java.util.Arrays;

public class TrainPlatforms {

    public static int findMinimumPlatforms(int[] arrival, int[] departure) {
        if (arrival == null || departure == null || arrival.length != departure.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int n = arrival.length;

        // Sort both arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;

        // Traverse through all arrival and departure times
        while (i < n && j < n) {
            // If a train arrives before the previous one departs, increase the count
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;
                maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
                i++;
            } else {
                // Else, a platform is freed
                platformsNeeded--;
                j++;
            }
        }

        return maxPlatforms;
    }
}
