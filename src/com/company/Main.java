package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = {6, 2, 3, 4, 5};

        System.out.println(Arrays.toString(factarray(arr)));
        System.out.println(Arrays.toString(lineararray(arr)));
        System.out.println(Arrays.toString(optimizedarr(arr)));
    }


    static int [] factarray(int[]arr){
        int [] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            int n = 1;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] != arr[j]){
                    n = n*arr[j];
                }
            }

            arr2[i] = n;
        }

        return arr2;
    }

    static int [] lineararray(int[] arr){
        int [] arr2 = new int[arr.length];
        int product = 1;

        for (int i = 0; i < arr.length; i++){
            product = product*arr[i];
        }

        for (int j = 0; j < arr.length; j++){
            arr2[j] = product/arr[j];
        }

        return arr2;
    }

    static int[] optimizedarr(int[] arr) {
        int[] arr2 = new int[arr.length];
        int[] arr3 = new int[arr.length];
        int[] arr4 = new int[arr.length];

        int temp = 1;
        int temp2 = 1;

        for(int i = 0; i < arr.length; i++){
            temp = temp*arr[i];
            arr2[i] = temp;
        }

        for (int j = arr.length -1; j >= 0; j--){
            temp2 = temp2*arr[j];
            arr3[j] =temp2;
        }

        for (int k = 0; k < arr.length; k++){

            if (k+1 == arr.length) {
                arr4[k] = arr2[k-1];
            }
            else if(k-1 < 0) {
                arr4[k] = arr3[k+1];
            }
            else {
                arr4[k] = arr2[k-1]*arr3[k+1];
            }
        }

        return arr4;
    }
}
