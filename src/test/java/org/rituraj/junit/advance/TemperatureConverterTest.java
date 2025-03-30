package org.rituraj.junit.advance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    private TemperatureConverter temperatureConverter;

    @BeforeEach
    void setup(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    @DisplayName("Celsius To Fahrenheit Test")
    void testCelsiusToFahrenheit(){
        assertEquals(102.2, temperatureConverter.celsiusToFahrenheit(39));

    }

    @Test
    @DisplayName("Fahrenheit To Celsius Test")
    void testFahrenheitToCelsius(){
        assertEquals(34.44444444444444, temperatureConverter.fahrenheitToCelsius(94));
    }
}
