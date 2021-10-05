package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class AngleTest {

    @Test
    public void checkAngle1() {
        // Given: We have an angle 1
        // When: we validate the angle

        IAngleV obj1 = new AngleV();
        boolean resolvedEquals = obj1.validate(1);

        // Then the angle is valid
        assertTrue(resolvedEquals);
    }

    @Test
    public void checkAngle2()

    {
        // Given: We have an angle 91
        // When: we validate the angle
        IAngleV obj2 = new AngleV();
        boolean resolvedEqualsone = obj2.validate(91);

        // Then: That angle is valid
        assertFalse(resolvedEqualsone);
    }

    @Test
    public void checkAngle3() {

        // Given: We have an angle 90
        // When: we validate the angle
        IAngleV obj3 = new AngleV();
        boolean resolvedEqualstwo = obj3.validate(90);

        // Then: That angle is valid
        assertTrue(resolvedEqualstwo);
    }

    @Test
    public void checkAngle4() {

        // Given: We have an angle 0
        // When: we validate the angle
        IAngleV obj4 = new AngleV();
        boolean resolvedEqualsthree = obj4.validate(0);

        // Then: That angle is invalid
        assertFalse(resolvedEqualsthree);
    }

}
