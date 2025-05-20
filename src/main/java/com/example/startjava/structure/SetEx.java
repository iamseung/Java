package com.example.startjava.structure;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < 10; i++) {
            set.add(String.valueOf(i));
        }
    }
}
