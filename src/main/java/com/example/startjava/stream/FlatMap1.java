package com.example.startjava.stream;

import java.util.List;

public class FlatMap1 {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
    }

    public static User parseUser() {
        User user = new User();
        user.id = 1L;

        Product product1 = new Product(1L, 1000, 100);
        Product product2 = new Product(2L, 1000, 100);
        Product product3 = new Product(3L, 1000, 100);
        Product product4 = new Product(4L, 1000, 100);
        Product product5 = new Product(5L, 1000, 100);
        Product product6 = new Product(6L, 1000, 100);
        Product product7 = new Product(7L, 1000, 100);
        Product product8 = new Product(8L, 1000, 100);
        Product product9 = new Product(9L, 1000, 100);
        Product product10 = new Product(10L, 1000, 100);

        user.orders = List.of(
                Order.builder().id(101L).totalPrice(2000).totalQuantity(2).product(product1).build(),
                Order.builder().id(102L).totalPrice(2000).totalQuantity(1).product(product2).build(),
                Order.builder().id(103L).totalPrice(7500).totalQuantity(5).product(product3).build()
        );

        return user;
    }
}
