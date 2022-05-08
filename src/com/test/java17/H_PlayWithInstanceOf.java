package com.test.java17;

import com.test.java17.model.Rectangle;
import com.test.java17.model.Shape;
import com.test.java17.model.Square;

public class H_PlayWithInstanceOf {
    public static void main(String[] args) {

    }

    public int surface(Shape shape) {
        if (shape instanceof Square square){
            return square.edge() * square.edge();
        } else if (shape instanceof Rectangle rect) {
            return rect.height() * rect.width();
        }
        //circle missing
        return 0;
    }
}
