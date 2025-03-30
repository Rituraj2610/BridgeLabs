package org.rituraj.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorExceptionTest {
    CalculatorException calculatorException;
    @BeforeEach
    void setup(){
        calculatorException = new CalculatorException();
    }

    @Test
    @DisplayName("Testing Arithemetic exception")
    void testDivide(){
        assertThrows(ArithmeticException.class, () -> calculatorException.divide(1,0));
    }
}
