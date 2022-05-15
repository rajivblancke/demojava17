package com.test.java17;

import java.util.Iterator;

public class D_PlayWithRecords {
    public static void main(String[] args) {
        record Range(int begin, int end) {

        }

        var range = new Range(0, 5);

        System.out.println("Range = " + range);

        //record with interface implementation, default constructor and validation rules
/*        record Range(int begin, int end) implements Iterable<Integer> {
            Range() {
                this(0, 0);
            }
            Range(int begin, int end) {
                if (begin > end) {
                    throw new IllegalArgumentException("End must be greater than begin");
                }
                this.begin = begin;
                this.end = end;
            }

            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    private int index = Range.this.begin;
                    @Override
                    public boolean hasNext() {
                        return index < Range.this.end;
                    }

                    @Override
                    public Integer next() {
                        return index++;
                    }
                };
            }
        }
        var range = new Range(0, 5);
        for (int index : range) {
            System.out.println("index = " + index);
        }

        System.out.println("Range = " + range);*/
    }
}
