package Test;

public class GameStart_TimeAttackMode {
	GameMainFrame gameMainFrame;
	GamePan_TimeAttackMode gamePan_TimeAttackMode;
	TargetGen_TimeAttackMode targetGen_TimeAttackMode;
	

	
	boolean gameStop = false;
	
	

	int point = 0 ;


	
	public GameStart_TimeAttackMode () {
	
		
		
	}
	
	void gamePan_TimeAttackMode_show() {
		
		gamePan_TimeAttackMode = new GamePan_TimeAttackMode(gameMainFrame);
		gamePan_TimeAttackMode.gameStart_TimeAttackMode = this;
		gamePan_TimeAttackMode.gamePan_menu();
	
		
		gameMainFrame.add(gamePan_TimeAttackMode);
		
	
		
	}
	
	void targetGen_TimeAttackMode_show() {
		
		targetGen_TimeAttackMode = new TargetGen_TimeAttackMode();
		targetGen_TimeAttackMode.gameMainFrame = gameMainFrame;
		targetGen_TimeAttackMode.gameStart_TimeAttackMode = this;
		targetGen_TimeAttackMode.gameStop = gameStop;
		targetGen_TimeAttackMode.gamePan_TimeAttackMode = gamePan_TimeAttackMode;

		targetGen_TimeAttackMode.start();
		Timer_TimeAttackMode timer_TimeAttackMode = new Timer_TimeAttackMode();
		timer_TimeAttackMode.gameStart_TimeAttackMode = this;
		timer_TimeAttackMode.start();
		
	}
	
	
}
// gamepan 라이프 삭제
// 타겟 invi 라이프시 겜종료 삭제
// 시간 추가
