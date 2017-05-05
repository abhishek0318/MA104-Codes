/*
 *  Abhishek Sharma
 *  16123002
 *  MA104 - Assignment 4
 *  Algorithm - "http://faculty.simpson.edu/lydia.sinapova/www/cmsc250/LN250_Tremblay/L06-QuickSort.htm"
 */
import java.util.Scanner;

public class Question4 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int size = reader.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = reader.nextInt();
        }
        QuickSort.quickSort(array);
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

class QuickSort {
    private static void insertionSort(int[] array, int left, int right) {
        for (int i = left; i < right; i++) {
            int j = i + 1;
            while (j > left && array[j] < array[j - 1]) {
                array[j] = array[j] ^ array[j - 1];
                array[j - 1] = array[j] ^ array[j - 1];
                array[j] = array[j] ^ array[j - 1];
                j--;
            }
        }
    }
    private static int choosePivot(int[] array, int left, int right) {
        int pivotPosition;
        int length = right - left + 1;
        int middle = left + length / 2;
        if ((array[left] <= array[middle] && array[left] >= array[right]) ||
                (array[left] >= array[middle] && array[left] <= array[right])) {
            pivotPosition = left;
        }
        else if ((array[middle] <= array[left] && array[middle] >= array[right]) ||
                (array[middle] >= array[left] && array[middle] <= array[right])) {
            pivotPosition = middle;
        }
        else {
            pivotPosition = right;
        }
        return pivotPosition;
    }
    private static int partition(int[] array, int left, int right, int pivotPosition) {

        // swap pivot and ending element
        if (array[pivotPosition] != array[right]) {
            array[pivotPosition] = array[pivotPosition] ^ array[right];
            array[right] = array[pivotPosition] ^ array[right];
            array[pivotPosition] = array[pivotPosition] ^ array[right];
        }

        int leftPointer = left;
        int rightPointer = right - 1;
        while (true) {
            while (leftPointer < right && array[leftPointer] < array[right]) leftPointer++;
            while (rightPointer >= left && array[rightPointer] > array[right]) rightPointer--;

            if (leftPointer < rightPointer) {
                array[leftPointer] = array[leftPointer] ^ array[rightPointer];
                array[rightPointer] = array[leftPointer] ^ array[rightPointer];
                array[leftPointer] = array[leftPointer] ^ array[rightPointer];
            }
            else break;
        }
        if (array[leftPointer] != array[right]) {
            array[leftPointer] = array[leftPointer] ^ array[right];
            array[right] = array[leftPointer] ^ array[right];
            array[leftPointer] = array[leftPointer] ^ array[right];
        }

        return leftPointer;
    }

    private static void quickSortUtil(int[] array, int left, int right) {
        int length = right - left + 1;

        if (length <= 10) {
            insertionSort(array, left, right);
            return;
        }

        int pivotPosition = choosePivot(array, left, right);
        pivotPosition = partition(array, left, right, pivotPosition);
        quickSortUtil(array, left, pivotPosition - 1);
        quickSortUtil(array, pivotPosition + 1, right);

    }

    public static void quickSort(int[] array) {
        quickSortUtil(array, 0, array.length - 1);
    }
};
