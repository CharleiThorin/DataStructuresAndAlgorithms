package org.sorting;

//O(nlogn) or it can be O(n^2) it's adaptive(we cant stop early), it's stable, inplace
public class QuickSort { //is a divide and conquer algorithm that uses a pivot to partition the list,
                        // with the smaller elements moved to the left of the pivot and the larger elements to the right.
                        // Algorithm depends on finding the right position of the pivot. It's wise to place pivot at left most element in the stat

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1, 4};
        quickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot - 1);
            quickSort(array, pivot + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return i + 1;
    }


}
