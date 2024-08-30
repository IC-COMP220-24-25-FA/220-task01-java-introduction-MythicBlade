package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
public class RectangleTest {
    
    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1,0));
    }
    
    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(1,1);
        assertEquals(1, myRectangle.calcArea(), 0.0001);
        
        myRectangle = new Rectangle(5,5);
        assertEquals(25, myRectangle.calcArea(), 0.0001);

        myRectangle = new Rectangle(0.1,0.1);
        assertEquals(0.01, myRectangle.calcArea(), 0.000001);
    }

}
