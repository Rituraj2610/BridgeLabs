package org.rituraj.junit.basic;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {

//    private StringUtility stringUtility;
    private String str;
    private String str2;

    @BeforeEach
    void setUp(){
//        stringUtility = new StringUtility();
        str = "abccba";
        str2 = "abc";
    }

    @Test
    @DisplayName("Reverse String Test")
    void testReverse(){
        ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputContent));

        StringUtility.reverse(str2);

        assertEquals("cba", outputContent.toString().trim());

        System.setOut(System.out);
    }

    @Test
    @DisplayName("Palindrome Checker with positive output")
    void testIsPalindrome(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringUtility.isPalindrome(str);

        assertEquals("Is a Palindrome", outputStream.toString().trim());

        System.setOut(System.out);
    }

    @Test
    @DisplayName("Palindrome Checker with negative output")
    void testIsNotPalindrome(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        StringUtility.isPalindrome(str2);

        assertEquals("Not a Palindrome", outputStream.toString().trim());

        System.setOut(System.out);
    }

    @Test
    @DisplayName("Convert to Uppercase")
    void testToUppercase(){
        assertEquals("ABC", StringUtility.toUpperCase(str2));
        assertEquals("ABCCBA", StringUtility.toUpperCase(str));
    }
}
