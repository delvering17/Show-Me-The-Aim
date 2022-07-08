package Test;
public class TargetGen extends Thread {
	GameMainFrame gameMainFrame;
	GameStart gameStart;
	//Target target;
	GamePan gamePan;
	
	boolean gameStop;
	
	@Override
	public void run() {
		
		while(true) {
			
			try {
				if(gameStart.life == 0) {
					break;
				}
				
				sleep(1000);	
				
				gamePan.add(new Target(gamePan));
				
	
				gamePan.repaint();			
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	

}
