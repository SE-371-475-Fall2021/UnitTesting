package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;
    @BeforeEach
    void setup(){calculator = new CalculatorClassActivity();}

    @Test
    @DisplayName("Confirm initial value is 0")
    void confirmInitialVal(){
        assertEquals(0, calculator.getValue(), "Value should be 0");
    }

    @Test
    @DisplayName("Confirm adding 7 to initial value")
    void add7(){
        calculator.add(7);
        assertEquals(7,calculator.getValue(),"Value should be 7");
    }

    @Test
    @DisplayName("Confirm subtracting 10 from initial value")
    void subtract10(){
        calculator.subtract(10);
        assertEquals(-10,calculator.getValue(),"Value should be -10");
    }
}