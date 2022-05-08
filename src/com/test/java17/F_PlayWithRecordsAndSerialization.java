package com.test.java17;

import com.test.java17.legacy.RangeLegacy;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class F_PlayWithRecordsAndSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var range = new RangeLegacy(10, 0);
        System.out.println("range = " + range);

        var fos = Files.newOutputStream(Path.of("files/range_legacy_10_0.dat"));
        var oos = new ObjectOutputStream(fos);
        oos.writeObject(range);

        //var fis = Files.newInputStream(Path.of("files/range_legacy_10_0.dat"));
        //var ois = new ObjectInputStream(fis);
        //System.out.println("Reading range");
        //var readRange = ois.readObject();
        //System.out.println("readRange = " + readRange);
    }
}
