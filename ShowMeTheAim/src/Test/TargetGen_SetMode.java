package Test;
public class TargetGen_SetMode extends Thread {
	GameMainFrame gameMainFrame;
	GameStart_SetMode gameStart_SetMode;
	//Target target;
	GamePan_SetMode gamePan_SetMode;
	
	boolean gameStop;
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				if(gameStart_SetMode.life == 0) {
					break;
				}
				
				sleep(gameStart_SetMode.genTime*100);	
				
				gamePan_SetMode.add(new Target_SetMode(gamePan_SetMode));
				
	
				gamePan_SetMode.repaint();			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

}
