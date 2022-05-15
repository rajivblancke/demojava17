package com.test.java17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class E_PlayWIthRecordsAndIO {
    static record RangeRecord(int begin, int end) implements Serializable {
        RangeRecord {
/*            if (begin > end) {
                throw new IllegalArgumentException("End must be greater than begin");
            }*/
        }
    }

    static class RangeClass implements Serializable{
        private final int begin;
        private final int end;

        RangeClass(int begin, int end) {
/*            if (begin > end) {
                throw new IllegalArgumentException("Begin must be smaller than end");
            }*/
            this.begin = begin;
            this.end = end;
            System.out.println("Building RangeClass");
        }

        @Override
        public String toString() {
            return "RangeClass{" +
                    "begin=" + begin +
                    ", end=" + end +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write corrupt rangeclass
        var range = new RangeClass(10, 0);
        System.out.println("range = " + range);

        var fos = Files.newOutputStream(Path.of("files/range_class_10_0.dat"));
        var oos = new ObjectOutputStream(fos);
        oos.writeObject(range);

        //read corrupt range instance
/*        var fis = Files.newInputStream(Path.of("files/range_class_10_0.dat"));
        var ois = new ObjectInputStream(fis);
        System.out.println("Reading range");
        var readRange = ois.readObject();
        System.out.println("readRange = " + readRange);*/

        //write corrupt rangerecord
/*        var range = new RangeRecord(10, 0);
        System.out.println("range = " + range);

        var fos = Files.newOutputStream(Path.of("files/range_record_10_0.dat"));
        var oos = new ObjectOutputStream(fos);
        oos.writeObject(range);*/

        //read corrupt rangerecord
/*        var fis = Files.newInputStream(Path.of("files/range_record_10_0.dat"));
        var ois = new ObjectInputStream(fis);
        System.out.println("Reading range");
        var readRange = ois.readObject();
        System.out.println("readRange = " + readRange);*/
    }
}
