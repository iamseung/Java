package com.example.startjava.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arr));
    }

    /*
    [4] 퀵 정렬 : 피벗 기준으로 좌우로 나누어 정렬 (분할 정복)
    시간 복잡도 평균 O(n log n), 최악은 N^2
    매우 빠르고 실무에서도 자주 사용, 불안정 정렬 & 구현 복잡
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = arr[(left + right) / 2];
        int i = left, j = right;

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i <= j) {
                int tmp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tmp;
            }
        }

        quickSort(arr, left, j);
        quickSort(arr, i, right);
    }
}
