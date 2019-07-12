package com.tts.lazy;

import java.util.stream.IntStream;

public class LazyDemo {
    private int doubleIt(int i) {
        System.out.println("Doubling " + i);
        return i * 2;
    }

    private boolean mod3(int i) {
        System.out.println("Mod 3 for " + i);
        return i % 3 == 0;
    }

    public static void main(String[] args) {
        LazyDemo demo = new LazyDemo();
        IntStream intStream = IntStream.rangeClosed(100, 200_000_000)
                //.parallel()
                .map(demo::doubleIt)
                .filter(demo::mod3);

        int sum = intStream.findFirst().orElseThrow(() -> new IllegalArgumentException());
        //.findFirst().orElse(-1);
//        System.out.println("The first double from 100 to 200" +
//                " divisible by 3 is " + result);
    }
}
