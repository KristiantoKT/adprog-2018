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

    public static int[] fastSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int i = low; //i is used for left pointer
        int j = high; //j is used for right pointer
        int pivotIdx = (low + high) / 2; //pivotIdx is used for getting the mid index of the array
        int pivot = arr[pivotIdx]; //getting the pivot value

        while (i <= j) {
            //searching for the element that more than pivot from left
            while (arr[i] < pivot) {
                i++; //increment left pointer if the element less than pivot
            }
            //searching for the element that less than pivot from right
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapping(arr, i, j); //swapping both element to get the correct position
                i++;
                j--;
            }
        }
        return arr;
    }

    public static void swapping(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
