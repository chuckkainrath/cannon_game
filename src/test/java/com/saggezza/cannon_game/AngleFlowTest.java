package com.saggezza.cannon_game;

import org.junit.Test;
//import org.testng.annotations.Test;
import org.mockito.*;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AngleFlowTest {

    // given: I am taking a shot and I have a target of 5,7

    // When: I enter an angle of 45

    // Then: I call my angle validator 1 time

    @Test
    public void AngleVTest1() {
        String input = "45";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IAngleV mockAngleObj1 = mock(IAngleV.class);
        when(mockAngleObj1.validate(45)).thenReturn(true);

        IAngleFlow AngleTestOne = new AngleFlow(mockAngleObj1);
        AngleTestOne.getAngle();

        verify(mockAngleObj1, times(1)).validate(45);

    }

    // given: I am taking a shot and I have a target of 5,7

    // When: I enter an angle of 0

    // Then: I call my angle validator 1 time

    @Test
    public void AngleVTest2() {
        String input = "0 45";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IAngleV mockAngleObj1 = mock(IAngleV.class);
        when(mockAngleObj1.validate(0)).thenReturn(false);
        when(mockAngleObj1.validate(45)).thenReturn(true);
        ArgumentCaptor<Integer> argCaptor = ArgumentCaptor.forClass(Integer.class);

        IAngleFlow AngleTestOne = new AngleFlow(mockAngleObj1);
        AngleTestOne.getAngle();

        verify(mockAngleObj1, times(2)).validate(argCaptor.capture());

    }

}
