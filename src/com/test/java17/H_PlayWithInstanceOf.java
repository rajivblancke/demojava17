package com.test.java17;

import com.test.java17.model.Rectangle;
import com.test.java17.model.Shape;
import com.test.java17.model.Square;

public class H_PlayWithInstanceOf {
    public static void main(String[] args) {

    }

    public int surface(Shape shape) {
        //pattern matching for instanceof
        if (shape instanceof Square) {
            return ((Square) shape).edge() * ((Square) shape).edge();
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).height() * ((Rectangle) shape).width();
        }
        //circle is missing here
        return 0;
    }
}
