package com.depaul.gsd;

import org.junit.jupiter.api.*;
//import static com.google.common.truth.Truth.assertThat;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Sarah Alanqari TestClass")
class CalculatorClassActivityTest {

    private CalculatorClassActivity testValue= new CalculatorClassActivity() ;


    @Test
    void getValueBefore() {
        assertEquals(0,this.testValue.getValue());
    }

    @Test
    void add() {
        this.testValue.add(7);
        assertEquals(7,this.testValue.getValue());
    }

    @Test
    void subtract() {
        this.testValue.subtract(10);
        assertEquals(-10,this.testValue.getValue());
    }

}