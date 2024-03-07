package org.sorting;

public class InterpolationSearch { //Improvement over binary search. Elements in a sorted list are uniformly distributed
    //Search location depends on whether element is closest to the largest or smallest element in list

    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            if (arr[pos] == x) {
                return pos;
            }

            if (arr[pos] < x) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x = 18;

        int index = interpolationSearch(arr, x);

        if (index != -1) {
            System.out.println("Element " + x + " is found at index " + index);
        } else {
            System.out.println("Element " + x + " is not found.");
        }
    }
}
