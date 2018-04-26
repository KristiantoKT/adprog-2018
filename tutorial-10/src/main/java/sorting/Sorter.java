package sorting;


public class Sorter {

    /**
     * Some sorting algorithm that possibly the slowest algorithm.
     *
     * @param inputArr array of integer that need to be sorted.
     * @return a sorted array of integer.
     */

    public static int[] slowSort(int[] inputArr) {
        int temp;
        for (int i = 1; i < inputArr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (inputArr[j] < inputArr[j - 1]) {
                    temp = inputArr[j];
                    inputArr[j] = inputArr[j - 1];
                    inputArr[j - 1] = temp;
                }
            }
        }
        return inputArr;
    }

}
