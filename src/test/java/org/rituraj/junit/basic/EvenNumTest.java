package org.rituraj.junit.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumTest {
    EvenNum evenNum;
    @BeforeEach
    void setup(){
        evenNum = new EvenNum();
    }

    @Test
    @DisplayName("Number is an Even number")
    void testIsEven(){
        assertTrue(evenNum.isEven(2));
    }

    @Test
    @DisplayName("Number is not an Even number")
    void testIsNotEven(){
        assertFalse(evenNum.isEven(3));
    }
}
