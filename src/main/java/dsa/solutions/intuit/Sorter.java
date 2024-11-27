package dsa.solutions.intuit;

import java.util.Arrays;

public class Sorter {
    public int[] sortArray(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        return sorted;
    }
}
