import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the SortingAlgorithms class.
 */
public class SortingAlgorithmsTest {

    /**
     * Tests QuickSort on an unsorted list.
     */
    @Test
    public void testQuickSort() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        SortingAlgorithms.quickSort(list);
        assertEquals(Arrays.asList(1, 1, 3, 4, 5, 9), list);
    }

    /**
     * Tests MergeSort on an unsorted list.
     */
    @Test
    public void testMergeSort() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        SortingAlgorithms.mergeSort(list);
        assertEquals(Arrays.asList(1, 1, 3, 4, 5, 9), list);
    }

    /**
     * Tests BubbleSort on an unsorted list.
     */
    @Test
    public void testBubbleSort() {
        List<Integer> list = Arrays.asList(3, 1, 4, 1, 5, 9);
        SortingAlgorithms.bubbleSort(list);
        assertEquals(Arrays.asList(1, 1, 3, 4, 5, 9), list);
    }
}
