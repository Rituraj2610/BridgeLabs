package org.rituraj.junit.advance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserRegistrationTest {
    UserRegistration userRegistration;
    @BeforeEach
    void setup(){
        userRegistration=new UserRegistration();
    }

    @Test
    @DisplayName("Testing for username")
    void testUsername(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        assertEquals("User registered successfully!", userRegistration.register("Abcd", "26rituraj@chitkara.edu.in", "Abcdefg123$@"));
    }

    @Test
    @DisplayName("Exception Testing for username")
    void testUsernameException(){
        assertThrows(IllegalArgumentException.class, () -> userRegistration.register("ab", "26rituraj@chitkara.edu.in", "Abcdefg123$#@"));
    }

    @Test
    @DisplayName("Exception Testing for email")
    void testEmailException(){
        assertThrows(IllegalArgumentException.class, () -> userRegistration.register("Abcd", "26rituraj@chitkara", "Abcdefg123$#@"));
    }

    @Test
    @DisplayName("Exception Testing for password")
    void testPasswordException(){
        assertThrows(IllegalArgumentException.class, () -> userRegistration.register("Abcd", "26rituraj@chitkara.edu.in", "Abcdefg123$#@"));
    }
}
