package Test;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Target_ChallengeMode extends JLabel implements MouseListener{
	
	
	Random r1 = new Random();
	GamePan_ChallengeMode gamePan_ChallengeMode;
	TargetInvisible targetInvisible;
	int targetSizeX = 30;
	int targetSizeY = 30;
	
	
	int targetX = r1.nextInt(700);
	int targetY = r1.nextInt(400)+100;
	
	boolean catchcatch = false;
	
	public Target_ChallengeMode(GamePan_ChallengeMode gamePan_ChallengeMode) {

		this.gamePan_ChallengeMode = gamePan_ChallengeMode;
		
		setBounds(targetX,targetY,targetSizeX,targetSizeY);
		ImageIcon img = new ImageIcon("imageSample/aimgame/playpan/target.png");
		setIcon(img);

		addMouseListener(this);
		targetInvisible = new TargetInvisible();
		
		
		targetInvisible.start();
	}
   
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		gamePan_ChallengeMode.gameStart_ChallengeMode.point += 1;
	
		
	
		gamePan_ChallengeMode.remove(this);
		
		catchcatch = true;
		gamePan_ChallengeMode.gamePan_point_show();

		gamePan_ChallengeMode.repaint();
	}
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	class TargetInvisible extends Thread {
	
		
		@Override
		public void run() {
				
				try {
					sleep(3000);

					if(catchcatch) {
						gamePan_ChallengeMode.remove(Target_ChallengeMode.this);
						
					} else if (gamePan_ChallengeMode.gameStart_ChallengeMode.gameStop) {
					} else {
						
						gamePan_ChallengeMode.gameStart_ChallengeMode.life -= 1;
						gamePan_ChallengeMode.remove(Target_ChallengeMode.this);
					
						
				
						gamePan_ChallengeMode.gamePan_life_show();
						
					}
					if (gamePan_ChallengeMode.gameStart_ChallengeMode.life == 0) {
						gamePan_ChallengeMode.gameStart_ChallengeMode.gameStop = true;
						gamePan_ChallengeMode.gameMainFrame.remove(gamePan_ChallengeMode);
						gamePan_ChallengeMode.gameMainFrame.GameOverPanel_show(gamePan_ChallengeMode.gameStart_ChallengeMode.point);
						gamePan_ChallengeMode.gameMainFrame.repaint();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}

}

