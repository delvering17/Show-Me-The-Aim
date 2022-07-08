package Test;

public class GameStart_SetMode {
	GameMainFrame gameMainFrame;
	GamePan_SetMode gamePan_SetMode;
	TargetGen_SetMode targetGen_SetMode;
	

	
	boolean gameStop = false;
	
	

	int point = 0 ;
	int life ;
	int genTime;
	
	public GameStart_SetMode (int life, int genTime) {
		this.life = life;
		this.genTime = genTime;
		
		
	}
	
	void gamePan_SetMode_show() {
		
		gamePan_SetMode = new GamePan_SetMode(gameMainFrame);
		gamePan_SetMode.gameStart_SetMode = this;
		gamePan_SetMode.gamePan_menu();
	
		
		gameMainFrame.add(gamePan_SetMode);
		
	
		
	}
	
	void targetGen_SetMode_show() {
		
		targetGen_SetMode = new TargetGen_SetMode();
		targetGen_SetMode.gameMainFrame = gameMainFrame;
		targetGen_SetMode.gameStart_SetMode = this;
		targetGen_SetMode.gameStop = gameStop;
		targetGen_SetMode.gamePan_SetMode = gamePan_SetMode;

		targetGen_SetMode.start();
		
	}
	
	
}
