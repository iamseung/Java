package com.example.startjava.stream;

import lombok.Builder;

import java.util.List;

public class Map1 {

    public static void main(String[] args) {
        User user = parseUser();

        // 주문 ID 목록 추출
        List<Long> orderIds = getOrderIds(user);
        System.out.println(orderIds.toString());

        // 상품 가격 목록 추출
        List<Integer> productPrices = getProductPrices(user);
        System.out.println(productPrices.toString());

        // 주문별 금액 + 수량
        List<Integer> orderMetrics = getOrderMetrics(user);
        System.out.println(orderMetrics.toString());
    }

    public static List<Long> getOrderIds(User user) {
        return user.orders.stream()
                .map(order -> order.id)
                .toList();
    }

    public static List<Integer> getProductPrices(User user) {
        return user.orders.stream()
                .map(order -> order.product.price)
                .toList();
    }

    public static List<Integer> getOrderMetrics(User user) {
        return user.orders.stream()
                .map(order -> order.totalPrice + order.totalQuantity)
                .toList();
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

class User {
    Long id;
    List<Order> orders;
}

@Builder
class Order {
    Long id;
    int totalPrice;
    int totalQuantity;
    Product product;
}

@Builder
class Product {
    Long productId;
    int price;
    int quantity;
}
