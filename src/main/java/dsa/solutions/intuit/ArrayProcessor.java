package dsa.solutions.intuit;

public class ArrayProcessor {
    private Sorter sorter;
    private Searcher searcher;
    private Statistics statistics;

    public ArrayProcessor() {
        sorter = new Sorter();
        searcher = new Searcher();
        statistics = new Statistics();
    }

    public int[] getSortedArray(int[] arr) {
        return sorter.sortArray(arr);
    }

    public boolean isElementPresent(int[] arr, int target) {
        return searcher.searchElement(arr, target);
    }

    public double calculateMean(int[] arr) {
        return statistics.computeMean(arr);
    }

    public double calculateMedian(int[] arr) {
        return statistics.computeMedian(arr);
    }

    public int calculateMode(int[] arr) {
        return statistics.computeMode(arr);
    }
}
