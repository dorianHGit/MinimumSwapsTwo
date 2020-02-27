package main;

public class Solution {
    public int minSwaps(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            while (arr[i]-1 != i){
                int j = arr[i]-1;
                int tempI = arr[i];
                int tempJ = arr[j];
                arr[i] = tempJ;
                arr[j] = tempI;
                swaps++;
            }
        }
        return swaps;
    }

}
