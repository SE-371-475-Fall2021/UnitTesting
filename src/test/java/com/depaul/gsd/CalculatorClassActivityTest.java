package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm the initial value is zero")
    void calculatorInitialValueZero() {
        assertEquals(0,calculator.getValue());
    }
}