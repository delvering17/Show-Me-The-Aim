package Test;
public class TargetGen_ChallengeMode extends Thread {
	GameMainFrame gameMainFrame;
	GameStart_ChallengeMode gameStart_ChallengeMode;
	Target_ChallengeMode target_ChallengeMode;
	GamePan_ChallengeMode gamePan_ChallengeMode;
	
	boolean gameStop;
	
	int targetGenSpeed ;
	@Override
	public void run() {
			
			while(true) {
				
				try {
					
					if (gameStart_ChallengeMode.gameStop){
						break;
						
					}
				
					sleep(targetGenSpeed);
					
					target_ChallengeMode = new Target_ChallengeMode(gamePan_ChallengeMode);
					
				
					target_ChallengeMode.gamePan_ChallengeMode = gamePan_ChallengeMode;
					
					gamePan_ChallengeMode.add(target_ChallengeMode);
					
					
					gamePan_ChallengeMode.setBounds(0, 0, 800, 601);
					gamePan_ChallengeMode.setBounds(0, 0, 800, 600);
			
	
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
		}

	

}
