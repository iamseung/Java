package com.example.startjava.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        mergeSort(arr);
        System.out.println("MergeSort: " + Arrays.toString(arr));
    }

    /*
    [5] 병합 정렬 : 배열을 계속 반으로 나눈 뒤 정렬하여 합침
    시간 복잡도 평균 O(n log n)
    안전 정렬, 공간 많이 사용 (배열 복사 필요)
     */
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }
}
