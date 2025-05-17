package com.example.startjava.poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();


        // 자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조), -> 부모가 자식 타입을 담았다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        // 자식의 기능을 호출할 수 없다.
        // Parent 클래스부터 시작해서 필요한 기능을 찾는데, 상속 관계는 부모 방향으로 찾아 올라갈 순 있지만 자식 방향으로 내려갈 순 없다.
        //poly.childMethod();
    }
}
