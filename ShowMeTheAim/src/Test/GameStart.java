package Test;

public class GameStart {
	GameMainFrame gameMainFrame;
	GamePan gamePan;
	TargetGen targetGen;
	

	
	boolean gameStop = false;
	
	

	int point = 0 ;
	int life = 5;

	
	public GameStart () {
	
		
		
	}
	
	void gamePan_show() {
		
		gamePan = new GamePan(gameMainFrame);
		gamePan.gameStart = this;
		gamePan.gamePan_menu();
	
		
		gameMainFrame.add(gamePan);
		
	
		
	}
	
	void targetGen_show() {
		
		targetGen = new TargetGen();
		targetGen.gameMainFrame = gameMainFrame;
		targetGen.gameStart = this;
		targetGen.gameStop = gameStop;
		targetGen.gamePan = gamePan;

		targetGen.start();
		
	}
	
	
}
