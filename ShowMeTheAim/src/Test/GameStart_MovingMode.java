package Test;

public class GameStart_MovingMode {
	GameMainFrame gameMainFrame;
	GamePan_MovingMode gamePan_MovingMode;
	TargetGen_MovingMode targetGen_MovingMode;
	

	
	boolean gameStop = false;
	
	

	int point = 0 ;
	int life = 5;

	
	public GameStart_MovingMode () {
	
		
		
	}
	
	void gamePan_MovingMode_show() {
		
		gamePan_MovingMode = new GamePan_MovingMode(gameMainFrame);
		gamePan_MovingMode.gameStart_MovingMode = this;
		gamePan_MovingMode.gamePan_menu();
	
		
		gameMainFrame.add(gamePan_MovingMode);
		
	
		
	}
	
	void targetGen_MovingMode_show() {
		
		targetGen_MovingMode = new TargetGen_MovingMode();
		targetGen_MovingMode.gameMainFrame = gameMainFrame;
		targetGen_MovingMode.gameStart_MovingMode = this;
		targetGen_MovingMode.gameStop = gameStop;
		targetGen_MovingMode.gamePan_MovingMode = gamePan_MovingMode;

		targetGen_MovingMode.start();
		
	}
	
	
}
