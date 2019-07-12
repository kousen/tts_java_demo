package com.tts.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortPeople {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Fred", "Flintstone"),
                new Person("Barney", "Rubble"),
                new Person("Wilma", "Flintstone"));

        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLast().compareTo(p2.getLast());
            }
        });

        System.out.println(people);

        Collections.sort(people, (p1, p2) -> p1.getFirst().compareTo(p2.getFirst()));
        System.out.println(people);

        people.stream()
                .sorted((p1, p2) -> p1.getFirst().compareTo(p2.getFirst()))
                .forEach(System.out::println);

        people.stream()
                .sorted(comparing(Person::getLast)
                        .thenComparing(Person::getFirst))
                .forEach(System.out::println);

    }
}
