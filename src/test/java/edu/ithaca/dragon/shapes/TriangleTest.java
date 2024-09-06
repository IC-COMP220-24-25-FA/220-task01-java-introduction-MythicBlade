package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    public TriangleTest() {
    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle =  new Triangle(1);
        assertEquals(0.866025, myTriangle.calcArea(),0.01);
    }

    @Test
    public void longestLineWithinTest(){
        Triangle myTriangle =  new Triangle(1);
        assertEquals(1, myTriangle.longestLineWithin(), 0.0);
    }

}