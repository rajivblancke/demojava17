package com.test.java17;

import java.util.List;

public class C_PlayWIthStreams {
    public static void main(String[] args) {
        var listOf = List.of("one", "two", "three", "four", "five");
        var count = listOf.stream()
                .count();

        System.out.println("Count: " + count);

        //add peek
/*        var countWithPeek = listOf.stream()
                //.skip(2)
                //.limit(2)
                //.filter(s -> true)
                .peek(System.out::println)
                .count();
        System.out.println("Count: " + countWithPeek);*/

        //stream with side effect
/*        var list = new ArrayList<String>();
        var count = listOf.stream()
                .map(s -> {
                    list.add(s);
                    return s.toUpperCase();
                })
                .count();
        System.out.println("Count: " + count);
        System.out.println("list: " + list);*/

        //toList added
/*        String ints = """
                1
                2
                3
                4
                5
                """;
        var list = ints.lines().map(Integer::parseInt)
                .toList();
        System.out.println("list: " + list);*/

        //mapMulti
/*        String ints = """
        1
        2
        3
        4
        test
        5
        """;
        var list = ints.lines()
                .map(Integer::parseInt)
                //.mapMulti((s, stream) -> {
                //    try {
                //        stream.accept(Integer.parseInt(s));
                //    } catch (NumberFormatException e) {}
                //})
                .toList();
        System.out.println("list: " + list);*/
    }
}
