package com.example.startjava.stream;

import java.util.stream.IntStream;

public class MapVSFlatMap {

    public static void main(String[] args) {
        final int SIZE = 10_000_000;

        // for loop
        long startFor = System.currentTimeMillis();
        long sumFor = 0;
        for (int i = 0; i < SIZE; i++) {
            sumFor += i;
        }
        long endFor = System.currentTimeMillis();
        System.out.println("for문 합계: " + sumFor);
        System.out.println("for문 처리 시간: " + (endFor - startFor) + "ms");

        // stream
        long startStream = System.currentTimeMillis();
        long sumStream = IntStream.range(0, SIZE)
                .asLongStream()
                .sum();
        long endStream = System.currentTimeMillis();
        System.out.println("stream 합계: " + sumStream);
        System.out.println("stream 처리 시간: " + (endStream - startStream) + "ms");

        // parallelStream
        long startParallel = System.currentTimeMillis();
        long sumParallel = IntStream.range(0, SIZE)
                .parallel()
                .asLongStream()
                .sum();
        long endParallel = System.currentTimeMillis();
        System.out.println("parallelStream 합계: " + sumParallel);
        System.out.println("parallelStream 처리 시간: " + (endParallel - startParallel) + "ms");
    }
}
