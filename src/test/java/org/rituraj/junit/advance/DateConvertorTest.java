package org.rituraj.junit.advance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DateConvertorTest {
    private DateConvertor dateConvertor;

    @BeforeEach
    void setup(){
        dateConvertor = new DateConvertor();
    }

    @Test
    @DisplayName("Testing with String Input")
    void testDateFormatterWithString(){
        assertEquals("01-01-2025", dateConvertor.dateFormatter("2025-01-01"));
    }

    @Test
    @DisplayName("Testing with LocalDate Input")
    void testDateFormatterWithLocalDate(){
        assertEquals("01-01-2025", dateConvertor.dateFormatter(LocalDate.of(2025, 1, 1)));
    }
}
