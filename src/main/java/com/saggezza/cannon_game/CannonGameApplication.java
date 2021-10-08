package com.saggezza.cannon_game;

//@SpringBootApplication
public class CannonGameApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CannonGameApplication.class, args);
		IShotFlow shotFlow = new ShotFlow(new AngleFlow(new AngleV()), new VelocityFlow(new VelocityValidityCheckObj()),
				new DegreeConversion(), new GettingFinalXCoordinate(), new CalculateYValue(), new RoundingObject(),
				new TargetHit()
		);
		ITarget target = new Target();
		IGameFlow gameFlow = new GameFlow(shotFlow, target);
		IPlayerData playerData = new PlayerData();
		IUpdateFlow updateFlow = new UpdateFlow(playerData, new UpdateBestScore(), new UpdateWorstScore(),
				new UpdateAverageScore());
		IDisplayFlow displayFlow = new DisplayFlow(playerData);
		IStartGameFlow startGameFlow = new StartGameFlow(playerData, displayFlow);
		IPostGameFlow postGameFlow = new PostGameFlow(playerData, updateFlow, displayFlow);
		IMainGameFlow mainGameFlow = new MainGameFlow(startGameFlow, gameFlow, postGameFlow);
		mainGameFlow.startGame();
	}

}
