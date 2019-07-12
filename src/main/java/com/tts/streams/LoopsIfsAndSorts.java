package com.tts.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopsIfsAndSorts {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

        List<Integer> evens = new ArrayList<>();
        for (int i : integers) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }

        Collections.sort(evens);
        System.out.println(evens);
    }
}
