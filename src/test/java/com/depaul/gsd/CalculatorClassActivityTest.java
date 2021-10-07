package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculatorClassActivity;

    @BeforeEach
    void setUp() { calculatorClassActivity = new CalculatorClassActivity();}

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void calculateInitialvalue() {
        assertEquals(0, calculatorClassActivity.getValue());
    }
}