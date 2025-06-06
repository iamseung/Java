package com.example.startjava.string;

public class String_EX {

    public static void main(String[] args) {
//        func1();
//        func2();
        func3();
    }

    public static void func1() {
        String haribo1st = new String("HARIBO");
        // 해당 함수는 lower case의 문자가 발견되지 않으면 기존의 객체를 반환한다.
        String copiedHaribo1st = haribo1st.toUpperCase();

        // == 는 참조값 비교
        System.out.println(haribo1st == copiedHaribo1st); // true
    }

    public static void func2() {
        String haribo1st = new String("HARIBO");
        String haribo3rd = "HARIBO";

        // 두 개의 문자열은 같은 값을 가지지만 실제로는 다른 객체이다.
        System.out.println(haribo1st == haribo3rd); // false
        System.out.println(haribo1st.equals(haribo3rd)); // true
    }

    /*
    valueOf()함수를 들어가보면 알겠지만, 주어진 매개 변수가 null인지 확인한 후
    null이 아니면 매개 변수의 toString()을 호출한다.
    여기서 String.toString()은 this를 반환한다.
    즉, 두 구문 모두 "HARIBO"처럼 리터럴 선언이다. 그렇다면 리터럴로 선언한 객체는 왜 같은 객체일까?

    바로 JVM에서 constant pool을 통해 문자열을 관리하고 있기 때문이다.
    리터럴로 선언한 문자열이 constant pool에 있으면 해당 객체를 바로 가져온다.
    만약 pool에 없다면 새로 객체를 생성한 후, pool에 등록하고 가져온다.
    이러한 플로우를 거치기 때문에 "HARIBO"로 선언한 문자열은 같은 객체로 나오는 것이다.
    String.intern() 함수를 참고해보자.
     */
    public static void func3() {
            String haribo3rd = "HARIBO";
            String haribo4th = String.valueOf("HARIBO");

            System.out.println(haribo3rd == haribo4th); // true
            System.out.println(haribo3rd.equals(haribo4th)); // true
    }
}
