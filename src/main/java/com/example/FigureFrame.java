package com.example;

import org.junit.jupiter.api.Test;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class FigureFrameTest {

    @Test
    public void testFigureColorIsRed() {
        FigureFrame frame = new FigureFrame();
        assertEquals(Color.RED, frame.getFigureColor());
    }
}