package org.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//O(n^2) depends on the interval chosen, works in place as well, use over insertion sort, bubble sort or selection sort
public class ShellSort { //uses insertion sort to sort list. relies on an interval to determine which elements get compared and in the process creates sub-lists

    public static void swap(List<Integer> lst, int indxI, int indxJ){
        int temp = lst.get(indxI);
        lst.set(indxI,lst.get(indxJ));
        lst.set(indxJ,temp);
    }

    public static List<Integer> performInsertionSort(List<Integer> lst, int interval) {

        if(lst.size() <= 1) {return lst;}

        for (int i= 0; i+interval< lst.size(); i = i+1){

            for(int j=i+interval; j-interval>=0; j=j-interval){
                boolean swapped = false;
                if(lst.get(j) < lst.get(j-interval)){
                    swap(lst, j-interval, j);
                    swapped = true;

                    System.out.println(lst);
                }

                if(!swapped){
                    break;
                }
            }
        }
        return lst;
    }

    public static List<Integer> performShellSort(List<Integer> lst){

        for (int interval = lst.size()/2; interval>=1; ){
            performInsertionSort(lst, interval);
            interval = interval/2;
        }
        return lst;
    }

    public static void main(String[] args) {
        System.out.println("Original : " + new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9)));
        System.out.println("\nFinal : " + performShellSort(new ArrayList<>(Arrays.asList(10,7,5,3,4,1,15,9))));
    }
}
