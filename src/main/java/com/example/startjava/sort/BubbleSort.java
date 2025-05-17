package com.example.startjava.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    [1] 버블 정렬 : 인접한 두 값을 비교하여 큰 값을 뒤로 버블처럼 밀어내는 방식
    시간 복잡도 N^2
    코드가 단순하지만 매우 느림.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
