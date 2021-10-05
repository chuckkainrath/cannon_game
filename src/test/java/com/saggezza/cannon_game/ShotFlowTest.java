package com.saggezza.cannon_game;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class ShotFlowTest {

    @Test
    public void angleFlowTest() {
//        Given: I am taking a shot and I have a target of 5,7
//        When: I get the input angle
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
//        Then: I call the Angle Flow Class 1 time
        verify(mockangleFlow, times(1)).getAngle();
    }

    @Test
    public void velocityFlowTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have an angle of 30
//        When: I get the input velocity
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
        //        Then: I call the Velocity Flow Class 1 time
        verify(mockvelocityFlow, times(1)).getVelocity();

    }

    @Test
    public void calculateDegreeTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have an angle of 30 and a velocity of 10
//        When: I get the degree
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
        //        Then: I call the convert to degree 1 time
        verify(mockDegreeConversion, times(1)).ConvertToDegrees(30);
    }

    @Test
    public void calculateXValueTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have a degree 0.52 and velocity of 10
//        When: I get the X coordinate
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
        //        Then: I call the getting final X coordinate 1 time
        verify(mockXCoordinate, times(1)).gettingFinalXCoordinate(.52, 10);
    }

    @Test
    public void calculateYValueTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have a degree 0.52 and velocity of 10
//        When: I get the Y coordinate
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
        //        Then: I call the getting final X coordinate 1 time
        verify(mockYCoordinate, times(1)).YValue(.52, 10);
    }

    @Test
    public void roundingObjectTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have a shot of 8.68, 4.97
//        When: I get final X and Y coordinate
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);
        ArgumentCaptor<Double> argCaptor = ArgumentCaptor.forClass(Double.class);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
//        Then: I call the rounding object 2 times
        verify(mockRoundingObject, times(2)).roundNumber(argCaptor.capture());
    }

    @Test
    public void targetHitTest() {
//        Given: I am taking a shot and I have a target of 5,7 and I have a shot of 9,5
//        When: I determine if the shot hit the target
        IAngleFlow mockangleFlow = mock(IAngleFlow.class);
        IVelocityFlow mockvelocityFlow = mock(IVelocityFlow.class);
        IDegreeConversion mockDegreeConversion = mock(IDegreeConversion.class);
        IGettingFinalXCoordinate mockXCoordinate = mock(IGettingFinalXCoordinate.class);
        ICalculateYValue mockYCoordinate = mock(ICalculateYValue.class);
        IRoundingObject mockRoundingObject = mock(IRoundingObject.class);
        ITargetHit mockTargetHit = mock(ITargetHit.class);

        when(mockangleFlow.getAngle()).thenReturn(30.0);
        when(mockvelocityFlow.getVelocity()).thenReturn(10.0);
        when(mockDegreeConversion.ConvertToDegrees(30)).thenReturn(0.52);
        when(mockXCoordinate.gettingFinalXCoordinate(.52, 10)).thenReturn(8.68);
        when(mockYCoordinate.YValue(.52, 10)).thenReturn(4.97);
        when(mockRoundingObject.roundNumber(8.68)).thenReturn(9);
        when(mockRoundingObject.roundNumber(4.97)).thenReturn(5);
        when(mockTargetHit.hit(9, 5, 5, 7)).thenReturn(false);

        IShotFlow shotFlow = new ShotFlow(mockangleFlow, mockvelocityFlow, mockDegreeConversion,
                mockXCoordinate, mockYCoordinate,
                mockRoundingObject, mockTargetHit);
        shotFlow.shoot(5, 7
        );
//        Then: I call the target hit one time
        verify(mockTargetHit, times(1)).hit(9, 5, 5, 7);
    }

}
