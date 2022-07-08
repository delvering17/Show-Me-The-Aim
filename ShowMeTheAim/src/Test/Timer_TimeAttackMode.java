package Test;
import javax.swing.JLabel;


public class Timer_TimeAttackMode extends Thread{
	

	GameMainFrame gameMainFrame;
	GameStart_TimeAttackMode gameStart_TimeAttackMode;
	GamePan_TimeAttackMode gamePan_TimeAttackMode;
	
	

	boolean gameStop ;
	
	
	@Override
	public void run() {
		
		gameStart_TimeAttackMode.gamePan_TimeAttackMode.gamePan_time_show();
		while(true) {
			
			for (int i = gameStart_TimeAttackMode.gamePan_TimeAttackMode.time; i >= 0; i--) {
				
				
				try {
					
					
					gameStart_TimeAttackMode.gamePan_TimeAttackMode.time = i ;
					gameStart_TimeAttackMode.gamePan_TimeAttackMode.gamePan_time_show();
					sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			gameStart_TimeAttackMode.gameMainFrame.remove(gameStart_TimeAttackMode.gamePan_TimeAttackMode);
			gameStart_TimeAttackMode.gamePan_TimeAttackMode.gameMainFrame.GameOverPanel_show(gameStart_TimeAttackMode.point);
			gameStart_TimeAttackMode.gameMainFrame.repaint();
			
			break;
		}
		gameStart_TimeAttackMode.gameStop = true;
	
	}
}
