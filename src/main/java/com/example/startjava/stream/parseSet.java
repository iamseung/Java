package com.example.startjava.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class parseSet {

    public static void main(String[] args) {
        String_Set_To_List();
        String_Set_To_String_Array();
    }

    // String Set To List
    public static void String_Set_To_List() {
        Set<String> set = Set.of("A", "B", "C", "D");
        List<String> list = set.stream().toList();
        System.out.println(list);
    }

    // String Set To String Array
    public static void String_Set_To_String_Array() {
        Set<String> set = Set.of("A", "B", "C", "D");

        String[] array = set.stream()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }
}
