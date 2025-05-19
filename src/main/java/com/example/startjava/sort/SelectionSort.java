package com.example.startjava.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
    [2] 선택 정렬 : 가장 작은 값을 선택해서 맨 앞과 교체
    시간 복잡도 N^2
    메모리 사용이 적지만 느리고 안정 정렬이 아니다.
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            // 좌측 커서
            int minIdx = i;

            // 좌측 커서 이후부터 비교
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
