package com.test.java17;

public class D_PlayWithRecords {
    public static void main(String[] args) {
        record Range(int begin, int end) {

        }

        var range = new Range(0, 5);

        System.out.println("Range = " + range);
    }
}
