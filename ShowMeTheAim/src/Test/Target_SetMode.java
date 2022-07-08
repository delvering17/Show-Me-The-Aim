package Test;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Target_SetMode extends JLabel implements MouseListener{
	
	
	Random r1 = new Random();
	GamePan_SetMode gamePan_SetMode;
	TargetInvisible targetInvisible;
	int targetSizeX = 30;
	int targetSizeY = 30;
	
	
	int targetX = r1.nextInt(700);
	int targetY = r1.nextInt(400)+100;
	
	boolean catchcatch = false;
	
	public Target_SetMode(GamePan_SetMode gamePan_SetMode) {

		this.gamePan_SetMode = gamePan_SetMode;
		
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
		gamePan_SetMode.gameStart_SetMode.point += 1;
		
	
		gamePan_SetMode.remove(this);
		
		catchcatch = true;
		gamePan_SetMode.gamePan_point_show();

		gamePan_SetMode.repaint();
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
						gamePan_SetMode.remove(Target_SetMode.this);
						
					} else {
						gamePan_SetMode.gameStart_SetMode.life -= 1;
						gamePan_SetMode.remove(Target_SetMode.this);
					
				
						gamePan_SetMode.gamePan_life_show();
						if (gamePan_SetMode.gameStart_SetMode.life == 0) {
							
							gamePan_SetMode.gameMainFrame.remove(gamePan_SetMode);
							gamePan_SetMode.gameMainFrame.GameOverPanel_show(gamePan_SetMode.gameStart_SetMode.point);
							gamePan_SetMode.gameMainFrame.repaint();
						}
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}

}

