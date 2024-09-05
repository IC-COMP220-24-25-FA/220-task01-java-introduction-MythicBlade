package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    public void longestLineWithinTest(){
        Rectangle myRectangle = new Rectangle(1,1);
        assertEquals(1.41421, myRectangle.longestLineWithin(), 0.0001);
        
        myRectangle = new Rectangle(5,5);
        assertEquals(7.07106, myRectangle.longestLineWithin(), 0.0001);

        myRectangle = new Rectangle(0.1,0.1);
        assertEquals(0.141421, myRectangle.longestLineWithin(), 0.000001);
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(1,1);
        myRectangle.doubleSize();
        assertEquals(2.828427, myRectangle.longestLineWithin(), 0.0001);
        
        myRectangle = new Rectangle(5,5);
        myRectangle.doubleSize();
        assertEquals(14.1421356, myRectangle.longestLineWithin(), 0.0001);

        myRectangle = new Rectangle(0.1,0.1);
        myRectangle.doubleSize();
        assertEquals(0.2828427, myRectangle.longestLineWithin(), 0.000001);
    }
}
