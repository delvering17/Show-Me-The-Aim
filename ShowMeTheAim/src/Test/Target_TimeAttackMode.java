package Test;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Target_TimeAttackMode extends JLabel implements MouseListener{
	
	
	Random r1 = new Random();
	GamePan_TimeAttackMode gamePan_TimeAttackMode;
	TargetInvisible targetInvisible;
	int targetSizeX = 30;
	int targetSizeY = 30;
	
	
	int targetX = r1.nextInt(700);
	int targetY = r1.nextInt(400)+100;
	
	boolean catchcatch = false;
	
	public Target_TimeAttackMode(GamePan_TimeAttackMode gamePan_TimeAttackMode) {

		this.gamePan_TimeAttackMode = gamePan_TimeAttackMode;
		
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
		gamePan_TimeAttackMode.gameStart_TimeAttackMode.point += 1;
		
		
	
		gamePan_TimeAttackMode.remove(this);
		
		catchcatch = true;
		gamePan_TimeAttackMode.gamePan_point_show();

		gamePan_TimeAttackMode.repaint();
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

					
					
						gamePan_TimeAttackMode.remove(Target_TimeAttackMode.this);
					
						
				
				
					

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}

}

