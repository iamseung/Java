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

        // b 라는 파라미터에 a 가 가진 주소값을 복사하여 가짐
        // 새로운 객체를 생성하고, 새로 생성된 주소값을 b가 가지며 a 는 원본 그대로 객체를 가리킴
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
