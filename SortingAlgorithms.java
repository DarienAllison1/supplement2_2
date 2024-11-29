import java.util.List;

/**
 * Utility class containing static methods for sorting lists using
 * QuickSort, MergeSort, and BubbleSort algorithms.
 */
public class SortingAlgorithms {

    /**
     * Sorts a list using the QuickSort algorithm.
     *
     * @param list The list to sort.
     */
    public static void quickSort(List<Integer> list) {
        quickSortHelper(list, 0, list.size() - 1);
    }

    private static void quickSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSortHelper(list, low, pivotIndex - 1);
            quickSortHelper(list, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /**
     * Sorts a list using the MergeSort algorithm.
     *
     * @param list The list to sort.
     */
    public static void mergeSort(List<Integer> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Integer> left = list.subList(0, mid);
            List<Integer> right = list.subList(mid, list.size());

            mergeSort(left);
            mergeSort(right);
            merge(list, left, right);
        }
    }

    private static void merge(List<Integer> list, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }

    /**
     * Sorts a list using the BubbleSort algorithm.
     *
     * @param list The list to sort.
     */
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    swap(list, j, j + 1);
                }
            }
        }
    }
}
