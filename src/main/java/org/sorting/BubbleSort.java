package org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//O(n^2)
public class BubbleSort {// compare adjacent elements in theory and place a pointer at the already sorted item in order to avoid sorting it again
    public static void swap(List<Integer> lst, int indxI, int indxJ){
        int temp = lst.get(indxI);
        lst.set(indxI,lst.get(indxJ));
        lst.set(indxJ,temp);
    }

    public static List<Integer> performBubbleSort(List<Integer> lst) {

        for (int i = lst.size()-1;  i >0; i--) {
            boolean swapped = false;
            for(int j = 0; j< i; j++){

                if(lst.get(j) > lst.get(j+1)){
                    swap(lst, j, j+1);
                    swapped = true;

                    System.out.println(lst);
                }

            }
            if (!swapped){
                break;
            }

        }


        return lst;
    }

    public static void main(String[] args) {
        System.out.println("Original : " + new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9)));
        System.out.println("\nFinal : " + performBubbleSort(new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9))));
    }
}
