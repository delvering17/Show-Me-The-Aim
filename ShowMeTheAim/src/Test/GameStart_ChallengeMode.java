package Test;

public class GameStart_ChallengeMode extends Thread {
	GameMainFrame gameMainFrame;
	GamePan_ChallengeMode gamePan_ChallengeMode;
	TargetGen_ChallengeMode targetGen_ChallengeMode;
	Timer_ChallengeMode timer_ChallengeMode;


	
	boolean gameStop = false;
	boolean waiting;
	
	int stage = 1;

	int point = 0 ;
	int life = 5;
	int targetGenSpeed;
	
	public GameStart_ChallengeMode () {
	
		
		
	}
	
	void gamePan_ChallengeMode_show() {
		
		
		gamePan_ChallengeMode = new GamePan_ChallengeMode(gameMainFrame);
		gamePan_ChallengeMode.gameStart_ChallengeMode = this;
		gamePan_ChallengeMode.gamePan_menu();
	
		
		gameMainFrame.add(gamePan_ChallengeMode);
		
	
		
	}
	public void run() {
		try {
			gamePan_ChallengeMode.stage1_show();
			
			sleep(3000);
			gamePan_ChallengeMode.remove(gamePan_ChallengeMode.gamepan_StageLogo1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		targetGen_ChallengeMode = new TargetGen_ChallengeMode();
		
		targetGen_ChallengeMode.gamePan_ChallengeMode = gamePan_ChallengeMode;
		targetGen_ChallengeMode.gameStart_ChallengeMode = this;
		targetGen_ChallengeMode.targetGenSpeed = 1000;
	
		targetGen_ChallengeMode.start();
	
		
	
		
		timer_ChallengeMode = new Timer_ChallengeMode();
		
		timer_ChallengeMode.gameMainFrame = gameMainFrame;
		timer_ChallengeMode.gamePan_ChallengeMode = gamePan_ChallengeMode;
		timer_ChallengeMode.gameStop = gameStop;
		timer_ChallengeMode.start();
		timer_ChallengeMode.gameStart_ChallengeMode = this;
		
	}

	void targetGen_ChallengeMode_show() {
		this.start();

		
		
	}
	
	
	
	
	void StageGo_ChallengeMode_show() {
	gameStop = false;
	
	targetGen_ChallengeMode = new TargetGen_ChallengeMode();
	
	targetGen_ChallengeMode.gamePan_ChallengeMode = gamePan_ChallengeMode;
	targetGen_ChallengeMode.gameStart_ChallengeMode = this;

	
	targetGen_ChallengeMode.targetGenSpeed = 850;
	
	switch (stage) {
	
	case 2: 	
		targetGen_ChallengeMode.targetGenSpeed = 700;
		break;
	case 3:	
		targetGen_ChallengeMode.targetGenSpeed = 550;
		break;
	case 4:
		targetGen_ChallengeMode.targetGenSpeed = 450;
		break;
	case 5:
		targetGen_ChallengeMode.targetGenSpeed = 350;
		break;
	}


	
	targetGen_ChallengeMode.start();
	}
}
