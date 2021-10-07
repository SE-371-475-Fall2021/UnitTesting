package com.depaul.gsd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity myCalculator;
    @BeforeEach
    void setUp() {
        myCalculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm the initial value is 0")
    void TestInitialValue() {
        assertEquals(0, myCalculator.getValue());
    }

    @Test
    @DisplayName("Confirm adding 7 to the initial value")
    void AddSeveltoinIntial() {
        myCalculator.add(7);
        assertEquals(7,myCalculator.getValue());
    }
    @Test
    @DisplayName("Confirm subtracting 10 from initial value")
    void subtractTenFromInitial() {
        myCalculator.subtract(10);
        assertEquals(-10, myCalculator.getValue());
    }


}