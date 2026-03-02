package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    
    @Test
    public void testAddition() {
        App calc = new App();
        // We expect 10 + 5 to equal 15
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        App calc = new App();
        // We expect 20 - 8 to equal 12
        assertEquals(12, calc.subtract(20, 8));
    }
}
