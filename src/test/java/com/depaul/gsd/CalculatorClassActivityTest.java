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
    @DisplayName("Result is 7")
    void addSevenToInitial(){
        calculator.add(7);
        assertEquals(7, calculator.getValue());
    }

    @Test
    @DisplayName("Result is -10")
        void substractFromInitial(){
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());
    }


}
