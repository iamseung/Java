package com.example.startjava.call;

import lombok.ToString;

public class Main {

    public static void main(String[] args) {
        User a = new User("gyoogle");   // 1
        System.out.println(a.hashCode()); // 193064360
        foo(a);

        System.out.println(a.toString());

        chaneName(a);
        System.out.println(a.toString());
    }

    public static void foo(User b){        // 2
        System.out.println(b.hashCode()); // 193064360
        b = new User("jongnan");    // 3
        System.out.println(b.hashCode()); // 109961541
    }

    public static void chaneName(User b) {
        b.name = "SS";
    }

    @ToString
    static class User {
        String name;

        User(String name) {
            this.name = name;
        }
    }
}
