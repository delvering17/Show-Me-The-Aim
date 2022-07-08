package Test;
public class TargetGen_MovingMode extends Thread {
	GameMainFrame gameMainFrame;
	GameStart_MovingMode gameStart_MovingMode;
	//Target target;
	GamePan_MovingMode gamePan_MovingMode;
	
	boolean gameStop;
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				if(gameStart_MovingMode.life == 0) {
					break;
				}
				
				sleep(1000);	
				
				gamePan_MovingMode.add(new Target_MovingMode(gamePan_MovingMode));
				
	
				gamePan_MovingMode.repaint();			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

}
