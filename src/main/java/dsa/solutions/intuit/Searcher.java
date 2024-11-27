package dsa.solutions.intuit;

public class Searcher {
    public boolean searchElement(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
