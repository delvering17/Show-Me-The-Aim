package Test;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameMainFrame extends JFrame {
	MainMenuPanel mainMenuPanel;
	ModeSelectPanel modeSelectPanel;
	DoummalPan doummalPan;
	SetMode_SetPan setMode_SetPan;
	GameStart_SetMode gameStart_SetMode ;
	GameStart_TimeAttackMode gameStart_TimeAttackMode;
	
	GameStart_MovingMode gameStart_MovingMode;
	GameStart_ChallengeMode gameStart_ChallengeMode;
	
	GamePan gamePan;
	
	GameStart gameStart;
	

	
	GameOverPanel gameOverPanel;
	
	
	public GameMainFrame() {
		
		setBounds(50, 50, 800, 600);
		setLayout(null);
		
		
		MainMenuPanel_show();
	
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	
		
	}
	

	
	public void MainMenuPanel_show () {
		mainMenuPanel =new MainMenuPanel();
		mainMenuPanel.gameMainFrame = this;
		
		add(mainMenuPanel);
		
	}
	
	public void ModeSelectPanel_show () {
		modeSelectPanel = new ModeSelectPanel();
		modeSelectPanel.gameMainFrame = this;
		add(modeSelectPanel);
	}
	
//	public void GamePan_show() {
//		gamePan = new GamePan();
//		gamePan.gameMainFrame = this;
//		TargetGen targetGen = new TargetGen();
//		targetGen.gameMainFrame = this;
//		add(gamePan);
//	}
	
	public void GameOverPanel_show(int point) {
		gameOverPanel = new GameOverPanel(point);
		gameOverPanel.gameMainFrame = this;
		add(gameOverPanel);
	}
	
	public void GameStart_show() {
		gameStart = new GameStart();
		gameStart.gameMainFrame = this;
		gameStart.gamePan_show();
		gameStart.targetGen_show();
		
	
		
		
		
//		gamePan = new GamePan();
//		gamePan.gameMainFrame = this;
//		TargetGen targetGen = new TargetGen();
//		targetGen.gameMainFrame = this;
//		add(gamePan);
	}
	
	public void GameStart_SetMode_SetPan_Show() {
		setMode_SetPan = new SetMode_SetPan();
		setMode_SetPan.gameMainFrame = this;
		add(setMode_SetPan);
	}
	
	public void DoummalPan_show() {
		doummalPan = new DoummalPan();
		doummalPan.gameMainFrame = this;
		add(doummalPan);
		
	}
	

	public void GameStart_SetMode_Show(int life, int genTime) {
		
		gameStart_SetMode = new GameStart_SetMode(life, genTime);
		gameStart_SetMode.gameMainFrame = this;
		gameStart_SetMode.gamePan_SetMode_show();
		gameStart_SetMode.targetGen_SetMode_show();
		
	}

	
	public void GameStart_TimeAttackMode_Show() {
		gameStart_TimeAttackMode = new GameStart_TimeAttackMode();
		gameStart_TimeAttackMode.gameMainFrame = this;
		gameStart_TimeAttackMode.gamePan_TimeAttackMode_show();
		gameStart_TimeAttackMode.targetGen_TimeAttackMode_show();
	}
	
	public void GameStart_ChallengeMode_Show() {
		gameStart_ChallengeMode = new GameStart_ChallengeMode();
		gameStart_ChallengeMode.gameMainFrame = this;
		gameStart_ChallengeMode.gamePan_ChallengeMode_show();
		gameStart_ChallengeMode.targetGen_ChallengeMode_show();
	}
	
	
	public void GameStart_MovingMode_Show() {
		gameStart_MovingMode = new GameStart_MovingMode();
		gameStart_MovingMode.gameMainFrame = this;
		gameStart_MovingMode.gamePan_MovingMode_show();
		gameStart_MovingMode.targetGen_MovingMode_show();
	}
	


	
}

