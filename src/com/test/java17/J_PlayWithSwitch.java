package com.test.java17;

import com.test.java17.model.Shape;

public class J_PlayWithSwitch {
    public static void main(String[] args) {

    }


    public int surface(Shape shape) {
        //switch expression with pattern matching
/*        return switch (shape) {
            case Rectangle rectangle:
                yield rectangle.height() * rectangle.width();
            case Square square:
                yield square.edge() * square.edge();
        };*/

        //switch expression with pattern matching and lambda's
/*        return switch (shape) {
            case Rectangle rectangle -> rectangle.height() * rectangle.width();
            case Square square -> square.edge() * square.edge();
        };*/
        return 0;
    }
}
