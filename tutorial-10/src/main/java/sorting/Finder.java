package sorting;

public class Finder {


    /**
     * Some searching algorithm that possibly the slowest algorithm.
     * This algorithm can search a value irregardless of whether the sequence already sorted or not.
     * @param arrOfInt is a sequence of integer.
     * @param searchedValue value that need to be searched inside the sequence.
     * @return -1 if there are no such value inside the sequence, else return searchedValue.
     */
    public static int slowSearch(int[] arrOfInt, int searchedValue) {
        int returnValue = -1;

        for (int element : arrOfInt) {
            if (element == searchedValue) {
                returnValue = element;
            }
        }

        return returnValue;
    }

    public static int fastSearch(int[] arrOfInt, int searchedValue) {
        int first = 0;
        int last = arrOfInt.length - 1;
        int returnValue = -1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arrOfInt[mid] < searchedValue) {
                first = mid + 1;
            } else if (arrOfInt[mid] == searchedValue) {
                returnValue = arrOfInt[mid];
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return returnValue;
    }
}
