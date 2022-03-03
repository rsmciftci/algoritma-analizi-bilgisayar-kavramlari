package rsmciftci.sorting;

public class BubbleSort {
    public static void sort(int[] arr){

        int length = arr.length;

        for(int i = 0; i < length-1; i++){
            int temp;
            for(int j = 0; j < length-1; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


            }
        }

    }
}
