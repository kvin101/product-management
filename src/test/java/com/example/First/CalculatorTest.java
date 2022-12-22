package com.example.First;

import com.example.First.temp.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();
    @Test
    public void testAdd() {
        System.out.println("Testing Add");
        assertEquals(15, calc.add(1,2,3,4,5));
    }

    @Test
    public void testSub() {
        System.out.println("Testing Subtraction");
        assertEquals(10, calc.sub(30,20));
    }

    @Test
    public void testMultiply() {
        System.out.println("Testing Multiplication");
        assertEquals(120, calc.multiply(1,2,3,4,5));
    }
}