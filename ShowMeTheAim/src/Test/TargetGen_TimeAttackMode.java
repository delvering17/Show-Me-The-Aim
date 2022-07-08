package Test;
public class TargetGen_TimeAttackMode extends Thread {
	GameMainFrame gameMainFrame;
	GameStart_TimeAttackMode gameStart_TimeAttackMode;
	//Target target;
	GamePan_TimeAttackMode gamePan_TimeAttackMode;
	
	boolean gameStop;
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				if(gameStart_TimeAttackMode.gameStop) {
					break;
				}
				
				sleep(1000);	
				
				gamePan_TimeAttackMode.add(new Target_TimeAttackMode(gamePan_TimeAttackMode));
				
	
				gamePan_TimeAttackMode.repaint();			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

}
