package org.sorting;

//O(n)
public class LinearSearch {   // look through all elements of an algorithm
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int index = search(arr, target);

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + index);
        }
    }
}
