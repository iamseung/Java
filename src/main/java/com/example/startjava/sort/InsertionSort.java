package com.example.startjava.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    [3] 삽입 정렬 : 앞에서부터 하나씩 정렬된 위치에 삽입
    시간 복잡도 N^2, 거의 정렬된 경우 O(n)
    구현 간단, 안전 정렬, TimSort 내부 일부로 쓰임
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n ; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
