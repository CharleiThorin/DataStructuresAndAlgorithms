package org.sorting;

//(sqrt(n))
public class JumpSearch {
    public static void main(String[] args) {
        String[] employees = {"Ben", "Charles", "Derrick", "ELvis", "Finch", "Gerrald",
                "Harry", "Ince", "Jerry", "Kyewalabye", "Louis"};

        int jumpLength = (int) Math.sqrt(employees.length);

        String target = "Louis";

        System.out.println("\nElement index: " + jumpSearch(employees, target, jumpLength));
    }

    private static int jumpSearch(String[] employees, String employee, int jumpLength) {
        int i = 0;
        while (employees[i].compareTo(employee) <= 0){
            System.out.println("Element is greater than or equal to: " + employees[i]);

            i = i  + jumpLength;

            if(i >= employees.length){break;}
        }

        int startInd = i - jumpLength;
        int endInd = Math.min(i, employees.length);

        System.out.println("Looking  between " + startInd + " and " + endInd);

        for (int j = startInd; j < endInd; j++){
            if(employees[j].equals(employee)){
                return j;
            }
        }
        return -1;
    }
}
