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

}
