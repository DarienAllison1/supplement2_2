import java.util.Arrays;
import java.util.List;

/**
 * Main class to demonstrate sorting methods in SortingAlgorithms.
 */
public class Main {
    public static void main(String[] args) {
        // Updated list of numbers
        List<Integer> list = Arrays.asList(8, 6, 7, 3, 2, 5);

        System.out.println("Original List: " + list);

        // QuickSort demonstration
        List<Integer> quickSorted = Arrays.asList(8, 6, 7, 3, 2, 5);
        SortingAlgorithms.quickSort(quickSorted);
        System.out.println("QuickSort: " + quickSorted);

        // MergeSort demonstration
        List<Integer> mergeSorted = Arrays.asList(8, 6, 7, 3, 2, 5);
        SortingAlgorithms.mergeSort(mergeSorted);
        System.out.println("MergeSort: " + mergeSorted);

        // BubbleSort demonstration
        List<Integer> bubbleSorted = Arrays.asList(8, 6, 7, 3, 2, 5);
        SortingAlgorithms.bubbleSort(bubbleSorted);
        System.out.println("BubbleSort: " + bubbleSorted);
    }
}
