package com.saggezza.cannon_game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class CannonGameApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CannonGameApplication.class, args);
		IShotFlow shotFlow = new ShotFlow(new AngleFlow(new AngleV()), new VelocityFlow(new VelocityValidityCheckObj()),
				new DegreeConversion(), new GettingFinalXCoordinate(), new CalculateYValue(), new RoundingObject(),
				new TargetHit()
		);
		ITarget target = new Target();
		target.createTarget();
		IGameFlow gameFlow = new GameFlow(shotFlow, target);
		gameFlow.playGame();
	}

}