package rsmciftci.sorting;

// O(n^2)
public class SelectionSort {

    public static void sort(int[] arr){
        int temp;
        int min;

        for(int i = 0; i < arr.length-1; i++){
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

}
