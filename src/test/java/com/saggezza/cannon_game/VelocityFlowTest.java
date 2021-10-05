package com.saggezza.cannon_game;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class VelocityFlowTest {

    @Test
    public void validInputTest() {
        // given: I am taking a shot

        // when: I enter a velocity of 10
        String input = "10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IVelocityValidityCheckObj mockVelocity = mock(IVelocityValidityCheckObj.class);
        when(mockVelocity.checkVelocity(10)).thenReturn(true);

        IVelocityFlow velocityFlow = new VelocityFlow(mockVelocity);
        velocityFlow.getVelocity();

        // then: I validate the velocity once
        verify(mockVelocity, times(1)).checkVelocity(10);
    }

    @Test
    public void inValidInputTest() {
        // given: I am taking a shot

        // when: I enter a velocity of 0 and 10
        String input = "0 10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IVelocityValidityCheckObj mockVelocity = mock(IVelocityValidityCheckObj.class);
        when(mockVelocity.checkVelocity(10)).thenReturn(true);
        ArgumentCaptor<Integer> argCaptor = ArgumentCaptor.forClass(Integer.class);

        IVelocityFlow velocityFlow = new VelocityFlow(mockVelocity);
        velocityFlow.getVelocity();

        // then: I validate the velocity once
        verify(mockVelocity, times(2)).checkVelocity(argCaptor.capture());
    }
}
