package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculatorClassActivity;

    @BeforeEach
    void setUp() {
         calculatorClassActivity = new CalculatorClassActivity();
    }
    
    @Test
    void getValue() {
        assertEquals(0,calculatorClassActivity.getValue());
    }

    @Test
    void add(){
        calculatorClassActivity.add(7);
        assertEquals(7,calculatorClassActivity.getValue());
    }

    @Test
    void subtract(){
        calculatorClassActivity.subtract(10);
        assertEquals(-10,calculatorClassActivity.getValue());
    }
}