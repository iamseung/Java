package com.example.startjava.sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {3,5,1,74,23,57,2,99,13,47,12};
        heapSort(arr);
        System.out.println("HeapSort: " + Arrays.toString(arr));
    }

    /*
    [6] 퀵 정렬 : 피벗 기준으로 좌우로 나누어 정렬 (분할 정복)
    시간 복잡도 평균 O(n log n)
    메모리 적게 사용, 불안정 정렬
    MergeSort 보다 느릴 수 있음
     */
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements
        for (int i = n - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < size && arr[l] > arr[largest]) largest = l;
        if (r < size && arr[r] > arr[largest]) largest = r;

        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            heapify(arr, size, largest);
        }
    }
}
