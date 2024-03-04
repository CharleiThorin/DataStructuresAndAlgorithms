package org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//O(N^2)
public class InsertionSort {  //in place, stable sort

    public static void swap(List<Integer> lst, int indxI, int indxJ){
        int temp = lst.get(indxI);
        lst.set(indxI,lst.get(indxJ));
        lst.set(indxJ,temp);
    }

    public static List<Integer> performInsertionSort(List<Integer> lst) {

        if(lst.size() <= 1) {return lst;}

        for (int i= 0; i< lst.size(); i++){

            for(int j=i; j>0; j--){
                boolean swapped = false;
                if(lst.get(j) < lst.get(j-1)){
                    swap(lst, j-1, j);
                    swapped = true;

                    System.out.println(lst);
                }

                if(!swapped){break;}
            }
        }
        return lst;
    }

    public static void main(String[] args) {
        System.out.println("Original : " + new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9)));
        System.out.println("\nFinal : " + performInsertionSort(new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9))));
    }
}
