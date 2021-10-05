package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DegreeConversionTest {

    @Test
    public void DegreeConversion1() {
        // Given: I have an angle of 45
        // When: I need it to be converted to degrees
        IDegreeConversion test1 = new DegreeConversion();
        double result = test1.ConvertToDegrees(45);

        // Then: I would pass the angle into the degree function and get back 0.78
        assertEquals(0.78, result, 0.01);

    }

    @Test
    public void DegreeConversion2() {
        // Given: I have an angle of 1
        // When: I need it to be converted to degrees
        IDegreeConversion test1 = new DegreeConversion();
        double result = test1.ConvertToDegrees(1);

        // Then: I would pass the angle into the degree function and get back 0.017
        assertEquals(0.017, result, 0.01);

    }

}
