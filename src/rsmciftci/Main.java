package rsmciftci;

import rsmciftci.sorting.BubbleSort;
import rsmciftci.sorting.InsertionSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5,3,6,1,76,12,86,1234};
        System.out.println("Before Sorting");
        for (int j : arr) System.out.print(" " + j);

        BubbleSort.sort(arr);
        System.out.println("\nAfterSorting");
        for (int j : arr) System.out.print(" " + j);

    }
}
