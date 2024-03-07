package org.sorting;

//O(logn)
public class BinarySearch { //uses divide and conquer and depends on a sorted list.
                    // we choose an element in the middle of the list and see if that element = the target
    public static int binarySearch(int[] arr, int begin, int end, int key) {
        if(begin < end){
            int mid = (begin + end)/2 ;
            if(arr[mid] == key){return mid;}
            if(key < arr[mid]){
                binarySearch(arr, begin, mid-1, key);
            } else {
                binarySearch(arr, mid+1, end, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;

        int index = binarySearch(arr,0, arr.length-1, target);

        if (index == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + index);
        }

    }
}
