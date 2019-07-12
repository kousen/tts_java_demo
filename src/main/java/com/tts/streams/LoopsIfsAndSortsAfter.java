package com.tts.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoopsIfsAndSortsAfter {
    public static void main(String[] args) {
        IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5)
                .filter(i -> i % 2 == 0)
                .sorted()
                .forEach(System.out::println);
    }
}
