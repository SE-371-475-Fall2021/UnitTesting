package com.depaul.gsd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    void setUp() {
        calculator = new CalculatorClassActivity();
    }

    @Test
    @DisplayName("Confirm calculator is initially 0")
    void emptyCalculatorTest() {
        assertEquals(0, calculator.getValue(), "Initial value will be 0");
    }

    @Test
    @DisplayName("Adding should result in 5")
    void addCalculatorTest() {
        calculator.add(5);
        assertEquals(5, calculator.getValue(), "value will now be 5");
    }

    @Test
    @DisplayName("Subtract should result in -10")
    void subtractCalculatorTest() {
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue(), "value will now be -10");
    }

}
