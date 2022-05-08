package com.test.java17;

import java.util.List;

public class C_PlayWIthStreams {
    public static void main(String[] args) {
        var listOf = List.of("one", "two", "three", "four", "five");
        var count = listOf.stream()
                .count();

        System.out.println("Count: " + count);

        //String ints = """
        //        1
        //        2
        //        3
        //        4
        //        5
        //        """;
    }
}
