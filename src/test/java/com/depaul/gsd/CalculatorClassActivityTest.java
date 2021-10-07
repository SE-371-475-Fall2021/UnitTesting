package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorClassActivityTest {
    CalculatorClassActivity calculator;


    @BeforeEach
    void setUp() { calculator = new CalculatorClassActivity();}

    @Test
    @DisplayName("First one is 0")

    void confirmFirstIsZero(){
        assertEquals(0, calculator.getValue(), "First is 0");
    }

    @Test
    @DisplayName("First one is 0")

    void addSevenToInitial(){
        assertEquals(7, calculator.add(calculator.getValue(), 7));
    }

    @Test
    @DisplayName("First one is 0")
        void substractFromInitial(){
        assertEquals(-10, calculator.subtract(calculator.getValue(), 10));
    }


}
