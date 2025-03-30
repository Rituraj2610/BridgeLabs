package org.rituraj.junit.advance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private PasswordValidator passwordValidator;

    @BeforeEach
    void setPasswordValidator(){
        passwordValidator = new PasswordValidator();
    }

    @Test
    @DisplayName("Test for strong Password")
    void testStrongPassword(){
        assertTrue(passwordValidator.checkPassword("Abcxzmnasuh%124"));
    }

    @Test
    @DisplayName("Test for weak Password")
    void testWeakPassword(){
        assertFalse(passwordValidator.checkPassword("Abcuh"));
    }
}
