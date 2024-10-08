package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.0331, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void TestConstructorError(){
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }

    @Test
    public void doubleSizeTest(){
        Circle tCircle = new Circle(1);
        tCircle.doubleSize();
        assertEquals(2, tCircle);

        tCircle = new Circle(4.5);
        tCircle.doubleSize();
        assertEquals(9, tCircle);

        tCircle = new Circle(3.00023232);
        tCircle.doubleSize();
        assertEquals(6.00046464, tCircle);
    }
    public void longestLineWithinTest(){
        Circle tCircle = new Circle(1);
        assertEquals(2, tCircle.longestLineWithin(), 0.0001);

        tCircle = new Circle(6.5);
        assertEquals(2, tCircle.longestLineWithin(), 0.0001);

        tCircle = new Circle(8.943);
        assertEquals(2, tCircle.longestLineWithin(), 0.0001);
    }


    
}
