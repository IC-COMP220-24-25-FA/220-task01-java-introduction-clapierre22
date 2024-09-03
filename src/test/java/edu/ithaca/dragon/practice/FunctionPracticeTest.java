package edu.ithaca.dragon.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        // Above test checks function to ensure that it executes in the manner intedned in the docstring

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
        // Above test checks functon to make sure that it responds to illegal inputs in the manner intended in the docstring
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(13.5, FunctionPractice.calcSalePrice(20, 0.5, 0.35));
        assertEquals(40.5, FunctionPractice.calcSalePrice(30, 0.1, 0.5));
        assertEquals(51.75, FunctionPractice.calcSalePrice(60, 0.25, 0.15));
        // Above test checks to make sure function executes in the way intended in the docstring

        assertEquals(40, FunctionPractice.calcSalePrice(20, 0.0, 1.0));
        assertEquals(12.5, FunctionPractice.calcSalePrice(25, 0.5, 0.0));
        assertEquals(0, FunctionPractice.calcSalePrice(0, 0.5, 0.35));
        // Above test checks function to ensure it responds to inputs that are not intended as in the docstring, but that should not break the code
    }

    @Test
    public void isGoodDogTest(){
        assertEquals(true, FunctionPractice.isGoodDog(2, 5, true));
        assertEquals(false, FunctionPractice.isGoodDog(2, 0, false));
        assertEquals(true, FunctionPractice.isGoodDog(5, 20, true));
        // Above test checks to make sure function executes in the way intended in the docstring
        
        assertEquals(false, FunctionPractice.isGoodDog(0, 0, true));
        assertEquals(false, FunctionPractice.isGoodDog(2, 0, true));
        assertEquals(false, FunctionPractice.isGoodDog(3, 5, false));
        // Above test checks to make sure the function still executes correctly despte contradictory input
    }
    
}
