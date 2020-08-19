package org.goda.java9.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamImprovementExamples {
    public static void main(String[] args) {

        //Another way for filtering - exclude filtering
        List<String> factoryBuildList = List.of("one", "two", "three");
        System.out.println("dropWhile example:");
        factoryBuildList.stream().dropWhile((item) -> item.equalsIgnoreCase("one")).forEach(System.out::println);

        // Inclusive filtering
        System.out.println("takeWhile example:");
        factoryBuildList.stream().takeWhile((item) -> item.equalsIgnoreCase("one")).forEach(System.out::println);

        //The ofNullable(T) method returns a sequential Stream containing a single element if this stream is non-null
        // otherwise method returns an empty Stream. It helps to handle the null stream and NullPointerException.
        System.out.println("ofNullable example (Empty):");
        Stream.ofNullable(null).forEach(System.out::println);
        System.out.println("ofNullable example (List):");
        Stream.ofNullable(factoryBuildList).forEach(System.out::println);

        //iterate method with predicate - Instead of doing a iterate.filter separately
        IntStream.iterate(0, i -> i < 10, i -> i + 2).forEach(System.out::println);

        //Collectors.filtering - https://mirocupak.com/java-9-enhancements-to-the-stream-api/
        List<Integer> numbers = List.of(2, 3, 4, 7, 9, 11);
        System.out.println("Collectors.filtering (Pre java 9):");
        Map<Object, Long> numbersFiltered = numbers.stream().filter(j -> j > 5).collect(Collectors.groupingBy(i -> i % 2, Collectors.counting()));
        System.out.println(numbersFiltered);
        Map<Object, Long> numbersFiltered2 = numbers.stream().collect(Collectors.groupingBy(i -> i % 2, Collectors.filtering(j -> j > 5, Collectors.counting())));
        System.out.println("Collectors.filtering (java 9):");
        System.out.println(numbersFiltered2);

        // Collectors.flatMapping - see https://mirocupak.com/java-9-enhancements-to-the-stream-api/ for more examples
    }
}
