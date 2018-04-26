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
}
