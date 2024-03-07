package org.sorting;

//O(nlogn) it's not adaptive(we cant stop early), it's stable, requires additional space
public class MergeSort {  //uses a divide and conquer to create small sub problems of the same criteria and sorts the small problem.
                            // Uses an artificial index and length of list to partition list

    public static void main(String[] args) {
        int[] arr = {70, 50, 30, 10, 20, 40, 60};
        
        int start = 0;
        int end = arr.length - 1;
        
        mergeSort(arr, start, end);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {

        if(start < end){
            int mid = (start +end)/ 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){
        //get sub-arr sizes
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];

        // Fill up the sub-Arrays
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start + i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid + 1 + i];
        }

        //iterate through the sub-Arrays
        int i = 0;
        int j = 0;
        int k = start;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;  // move the pointer of the arr element that gets inserted
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
