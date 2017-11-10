package com.example.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2,3));
        assertEquals(8, calculator.sum(4,4));
    }

    @Test
    public void testDiv() {
        assertEquals(8, calculator.div(16,2));
        assertEquals(5, calculator.div(25,5));
    }
}