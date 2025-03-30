package org.rituraj.junit.basic;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }


    @Test
    @DisplayName("Addition Test")
    void testAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    @DisplayName("Subtraction Test")
    void testSubtract(){
        assertEquals(0, calculator.subtract(1,1));
    }

    @Test
    @DisplayName("Division Test")
    void testDivide(){
        assertEquals(2, calculator.divide(4,2));
    }
}
