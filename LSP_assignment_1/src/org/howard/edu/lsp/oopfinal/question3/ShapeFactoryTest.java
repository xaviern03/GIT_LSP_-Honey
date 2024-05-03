package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testCircleCreation() {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        assertEquals("I’m a Circle!!!", outContent.toString().trim());
    }

    @Test
    public void testRectangleCreation() {
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        assertEquals("I’m a Rectangle!!!", outContent.toString().trim());
    }
}
