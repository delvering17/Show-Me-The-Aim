package Test;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Target extends JLabel implements MouseListener{
	
	
	Random r1 = new Random();
	GamePan gamePan;
	TargetInvisible targetInvisible;
	int targetSizeX = 30;
	int targetSizeY = 30;
	
	
	int targetX = r1.nextInt(700);
	int targetY = r1.nextInt(400)+100;
	
	boolean catchcatch = false;
	
	public Target(GamePan gamePan) {

		this.gamePan = gamePan;
		
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
		gamePan.gameStart.point += 1;
		
		
	
		gamePan.remove(this);
		
		catchcatch = true;
		gamePan.gamePan_point_show();

		gamePan.repaint();
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
						gamePan.remove(Target.this);
						
					} else {
						gamePan.gameStart.life -= 1;
						gamePan.remove(Target.this);
					
						
				
						gamePan.gamePan_life_show();
						if (gamePan.gameStart.life == 0) {
							
							gamePan.gameMainFrame.remove(gamePan);
							gamePan.gameMainFrame.GameOverPanel_show(gamePan.gameStart.point);
							gamePan.gameMainFrame.repaint();
						}
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}

}

