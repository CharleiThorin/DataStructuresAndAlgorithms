package org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//O(N^2)
public class SelectionSort {
public static void swap(List<Integer> lst, int indxI, int indxJ){
    int temp = lst.get(indxI);
    lst.set(indxI,lst.get(indxJ));
    lst.set(indxJ,temp);
}
    public static List<Integer> performSelectionSort(List<Integer> lst){
        for(int i= 0; i<lst.size(); i++){
            for (int j=i+1; j< lst.size(); j++){          //O(N^2)
                if(lst.get(i) > lst.get(j)){
                    swap(lst, i, j);

                    System.out.println(lst);
                }
            }

        }
        return lst;
    }

    public static void main(String[] args) {
        System.out.println("Original : " + new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9)));
        System.out.println("\nFinal : " + performSelectionSort(new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9))));
    }
}

