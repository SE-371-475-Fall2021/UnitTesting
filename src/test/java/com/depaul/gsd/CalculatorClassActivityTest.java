package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;
    @BeforeEach
    void setup(){calculator = new CalculatorClassActivity();}

    @Test
    void confirmInitialVal(){
        assertEquals(0, calculator.getValue(), "Value should be 0");
    }

    
}