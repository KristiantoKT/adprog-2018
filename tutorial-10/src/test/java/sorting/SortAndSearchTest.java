package sorting;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

public class SortAndSearchTest {
    int[] arr = {2,3,1,4,5,9,10,7,8,6};

    @Test
    public void testSorter() {
        int[] slowSorted = Sorter.slowSort(arr);
        int[] fastSorted = Sorter.fastSort(arr);
        assertTrue(Arrays.equals(slowSorted, fastSorted));
    }

    @Test
    public void testFinder() {
        int slowFinder = Finder.slowSearch(arr, 6);
        int fastFinder = Finder.fastSearch(arr, 6);
        assertTrue(slowFinder == fastFinder);
    }
}
