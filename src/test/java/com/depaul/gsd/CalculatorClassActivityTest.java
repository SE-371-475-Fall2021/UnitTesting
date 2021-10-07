package com.depaul.gsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassActivityTest {
    CalculatorClassActivity calculatorca;

    @BeforeEach
    void setUp() {
        calculatorca= new CalculatorClassActivity();
    }
    @Test
    @DisplayName("Checking initial 0 value")
    void checkInitialValueZero(){
        assertEquals(0,calculatorca.getValue());
    }
    @Test
    @DisplayName("Adding 7 to 0")
    void addingSeven(){
        calculatorca.add(7);
        assertEquals(7,calculatorca.getValue());

    }
    @Test
    @DisplayName("Subtracting 10 from 0")
    void subtractingTen(){
        calculatorca.subtract(10);
        assertEquals(-10,calculatorca.getValue());

    }


}