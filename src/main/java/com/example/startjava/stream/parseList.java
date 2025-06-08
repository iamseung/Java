package com.example.startjava.stream;

import java.util.Arrays;
import java.util.List;

public class parseList {

    public static void main(String[] args) {
        String_List_To_Array();
        Integer_List_To_Integer_Array();
        Integer_List_To_int_Array();
    }

    public static void String_List_To_Array() {
        List<String> list = List.of("A", "B", "C", "D");

        String[] array = list.stream().toArray(String[]::new);
        // String[] array = list.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

    public static void Integer_List_To_Integer_Array() {
        List<Integer> list = List.of(1,2,3,4,5);
        Integer[] array = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }

    public static void Integer_List_To_int_Array() {
        List<Integer> list = List.of(1,2,3,4,5);

        int[] array = list.stream()
                .mapToInt(Integer::intValue) // Integer -> int unboxing
                .toArray();

        System.out.println(Arrays.toString(array));
    }
}
