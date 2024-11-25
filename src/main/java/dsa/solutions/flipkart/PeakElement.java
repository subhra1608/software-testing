package dsa.solutions.flipkart;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid; // Move to the left half
            } else {
                left = mid + 1; // Move to the right half
            }
        }

        return left; // Left and right converge to the peak element
    }
}
