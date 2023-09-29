package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SquareTest {
    @Test
    void testPerimeter() {
        Square square = new Square(2);
        int perimeter = square.perimeter();
        assertEquals(8, perimeter);
    }
}
