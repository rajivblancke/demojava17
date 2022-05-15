package com.test.java17;

public class B_PlayWithStrings {
    public static void main(String[] args) {
        String numbers = "one two three four five";

        System.out.println("numbers = " + numbers);

        //textblock
        /*String numbersTextBlock = """
             one
             "two"
             'three'
             four
             five
          """;

        System.out.println("numbers = " + numbersTextBlock);*/

        //textblock trailing spaces
        /*String numberTrailingSpaces = """
             one     \s
             "two"   \s
             'three' \s
             four    \s
             five    \s
          """;
        numberTrailingSpaces.lines().map(s -> "|" + s + "|").forEach(System.out::println);*/
    }
}
