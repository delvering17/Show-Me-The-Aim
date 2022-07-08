package Test;
import javax.swing.JLabel;


public class Timer_ChallengeMode extends Thread{
	GameMainFrame gameMainFrame;
	GameStart_ChallengeMode gameStart_ChallengeMode;
	GamePan_ChallengeMode gamePan_ChallengeMode;
	JLabel timeLB = new JLabel();
	
	boolean gameStop;
	
	
	
	@Override
	public void run() {
		
		while(true) {
			for(int i = 20; i >= 0; i--) {
					
					try {
						sleep(1000);
						
						timeLB.setText("시간:" +i);
						
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (gameStart_ChallengeMode.gameStop) {
						break;
						
					}
		
			}
			if (gameStart_ChallengeMode.gameStop) {
				break;
				
			}
			gameStart_ChallengeMode.waiting = true ;
			gameStart_ChallengeMode.gameStop = true;
			gameMainFrame.remove(gamePan_ChallengeMode);
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
			gameStart_ChallengeMode.gamePan_ChallengeMode_show();
			
			gameStart_ChallengeMode.stage ++;
			gameStart_ChallengeMode.gamePan_ChallengeMode.stage2_show();
			for(int i = 5; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("대기시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			gameStart_ChallengeMode.waiting = false ;
			gameStart_ChallengeMode.gamePan_ChallengeMode.remove(gameStart_ChallengeMode.gamePan_ChallengeMode.gamepan_StageLogo2);
			gameStart_ChallengeMode.gamePan_ChallengeMode.repaint();
			gameStart_ChallengeMode.StageGo_ChallengeMode_show();// false
			
			
			
// 2~ 5스테이지 FOR문 
				
				// 2 스테이지
			for(int i = 20; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (gameStart_ChallengeMode.gameStop) {
					break;
				}
				
			}
			
			if (gameStart_ChallengeMode.gameStop) {
				break;
				
			}
			
			gameStart_ChallengeMode.waiting = true ;
			gameStart_ChallengeMode.gameStop = true;
			gameMainFrame.remove(gameStart_ChallengeMode.gamePan_ChallengeMode);
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
			gameStart_ChallengeMode.gamePan_ChallengeMode_show();
			gameStart_ChallengeMode.gamePan_ChallengeMode.stage3_show();
			gameStart_ChallengeMode.stage ++;
			for(int i = 5; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("대기시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			gameStart_ChallengeMode.gamePan_ChallengeMode.remove(gameStart_ChallengeMode.gamePan_ChallengeMode.gamepan_StageLogo3);
			gameStart_ChallengeMode.gamePan_ChallengeMode.repaint();
			gameStart_ChallengeMode.waiting = false ;
			gameStart_ChallengeMode.StageGo_ChallengeMode_show();// false
			
		
					//타겟이 안보임
				
				// 3 스테이지
			for(int i = 20; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (gameStart_ChallengeMode.gameStop) {
					break;
				}
			}
			
			if (gameStart_ChallengeMode.gameStop) {
				break;
				
			}
			
			gameStart_ChallengeMode.waiting = true ;
			gameStart_ChallengeMode.gameStop = true;
			gameMainFrame.remove(gameStart_ChallengeMode.gamePan_ChallengeMode);
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
			gameStart_ChallengeMode.gamePan_ChallengeMode_show();
			gameStart_ChallengeMode.gamePan_ChallengeMode.stage4_show();
			gameStart_ChallengeMode.stage ++;
			for(int i = 5; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("대기시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			gameStart_ChallengeMode.gamePan_ChallengeMode.remove(gameStart_ChallengeMode.gamePan_ChallengeMode.gamepan_StageLogo4);
			gameStart_ChallengeMode.gamePan_ChallengeMode.repaint();
			gameStart_ChallengeMode.waiting = false ;
			gameStart_ChallengeMode.StageGo_ChallengeMode_show();// false
			
		
				// 4 스테이지
			for(int i = 20; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (gameStart_ChallengeMode.gameStop) {
					break;
				}
			}
			
			if (gameStart_ChallengeMode.gameStop) {
				break;
				
			}
			
			
			gameStart_ChallengeMode.waiting = true ;
			gameStart_ChallengeMode.gameStop = true;
			gameMainFrame.remove(gameStart_ChallengeMode.gamePan_ChallengeMode);
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
			gameStart_ChallengeMode.gamePan_ChallengeMode_show();
			gameStart_ChallengeMode.gamePan_ChallengeMode.stage5_show();
			gameStart_ChallengeMode.stage ++;
			for(int i = 5; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("대기시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			gameStart_ChallengeMode.gamePan_ChallengeMode.remove(gameStart_ChallengeMode.gamePan_ChallengeMode.gamepan_StageLogo5);
			gameStart_ChallengeMode.gamePan_ChallengeMode.repaint();
			gameStart_ChallengeMode.waiting = false ;
			gameStart_ChallengeMode.StageGo_ChallengeMode_show();// false
			
				// 5 스테이지
				
			for(int i = 20; i >= 0; i--) {
				
				try {
					sleep(1000);
					
					timeLB.setText("시간:" +i);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (gameStart_ChallengeMode.gameStop) {
					break;
				}
			}
			
			if (gameStart_ChallengeMode.gameStop) {
				break;
				
			}
			
			
			gameStart_ChallengeMode.waiting = true ;
			gameStart_ChallengeMode.gameStop = true;
			gameMainFrame.remove(gameStart_ChallengeMode.gamePan_ChallengeMode);
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
			gameStart_ChallengeMode.gamePan_ChallengeMode_show();
			

	
			gameStart_ChallengeMode.waiting = false ;

			
			
			gameStart_ChallengeMode.gameMainFrame.remove(gameStart_ChallengeMode.gamePan_ChallengeMode);
			gameStart_ChallengeMode.gameMainFrame.GameOverPanel_show(gameStart_ChallengeMode.point);
			gameStart_ChallengeMode.gameMainFrame.repaint();
			gameStart_ChallengeMode.gameStop = true;
			break;
				
			}
				

		}
		
		
	}

