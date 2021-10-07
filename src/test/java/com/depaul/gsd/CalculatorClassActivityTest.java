package com.depaul.gsd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

//Static import helps to use assert methods directly, instead of e.g. Assert.assertEquals()
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorClassActivityTest {

    CalculatorClassActivity calculator;

    @BeforeEach
    void setup(){
        calculator = new CalculatorClassActivity();
    }
    @Test
    @DisplayName("Confirm initial value is 0")
    void testInitialValueZero(){
        assertEquals(0, calculator.getValue());
    }

    @Test
    @DisplayName("Add 7 to intial value")
    void addSevenToInitial(){
        calculator.add(7);
        int actual = calculator.getValue();
        assertEquals(7, actual);
    }

    @Test
    @DisplayName("Subtract 10 from initial value")
    void subtractTenFromInitial(){
        calculator.subtract(10);
        assertEquals(-10, calculator.getValue());
    }


}
