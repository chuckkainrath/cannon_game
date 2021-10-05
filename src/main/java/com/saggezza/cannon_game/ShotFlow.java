package com.saggezza.cannon_game;
public class ShotFlow implements IShotFlow{
    private IAngleFlow angleFlow;
    private IVelocityFlow velocityFlow;
    private IDegreeConversion degreeConversion;
    private IGettingFinalXCoordinate finalXCoordinate;
    private ICalculateYValue finalYCoordinate;
    private IRoundingObject roundingObject;
    private ITargetHit targetHit;


    public ShotFlow(IAngleFlow angleFlow,
                    IVelocityFlow velocityFlow, IDegreeConversion degreeConversion,
                    IGettingFinalXCoordinate finalXCoordinate, ICalculateYValue finalYCoordinate,
                    IRoundingObject roundingObject, ITargetHit targetHit){
        this.angleFlow = angleFlow;
        this.velocityFlow = velocityFlow;
        this.degreeConversion= degreeConversion;
        this.finalXCoordinate= finalXCoordinate;
        this.finalYCoordinate= finalYCoordinate;
        this.roundingObject= roundingObject;
        this.targetHit= targetHit;
    }

    public boolean shoot(int targetX, int targetY) {
        double angle = angleFlow.getAngle();
        double velocity = velocityFlow.getVelocity();
        double degree = degreeConversion.ConvertToDegrees(angle);
        double X = finalXCoordinate.gettingFinalXCoordinate(degree, velocity);
        double Y = finalYCoordinate.YValue(degree, velocity);
        int finalX = roundingObject.roundNumber(X);
        int finalY = roundingObject.roundNumber(Y);
        System.out.println("Your shot hit X: " + finalX + " Y: " + finalY);
        return targetHit.hit(finalX, finalY, targetX, targetY);
    }
}