package Test;


import java.awt.event.*;
import java.util.*;
import javax.swing.*;



public class Target_MovingMode extends JLabel implements MouseListener{
	
	
	Random r1 = new Random();
	GamePan_MovingMode gamePan_MovingMode;
	TargetInvisible targetInvisible;
	int targetSizeX = 30;
	int targetSizeY = 30;
	int dx, dy = 0;
	
	int targetX = r1.nextInt(700);
	int targetY = r1.nextInt(400)+100;
	
	boolean catchcatch = false;
	
	public Target_MovingMode(GamePan_MovingMode gamePan_MovingMode) {

		this.gamePan_MovingMode = gamePan_MovingMode;
		
		setBounds(targetX,targetY,targetSizeX,targetSizeY);
		ImageIcon img = new ImageIcon("imageSample/aimgame/playpan/target.png");
		setIcon(img);

		addMouseListener(this);
		targetInvisible = new TargetInvisible();
		targetInvisible.start();
		
		Timer_TargetMoving timer_TargetMoving = new Timer_TargetMoving();
		timer_TargetMoving.target_MovingMode = this;
		timer_TargetMoving.start();
		
	}
   
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		gamePan_MovingMode.gameStart_MovingMode.point += 1;
		
	
		gamePan_MovingMode.remove(this);
		
		catchcatch = true;
		gamePan_MovingMode.gamePan_point_show();

		gamePan_MovingMode.repaint();
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
						gamePan_MovingMode.remove(Target_MovingMode.this);
						
					} else {
						gamePan_MovingMode.gameStart_MovingMode.life -= 1;
						gamePan_MovingMode.remove(Target_MovingMode.this);
					
				
						gamePan_MovingMode.gamePan_life_show();
						if (gamePan_MovingMode.gameStart_MovingMode.life == 0) {
							gamePan_MovingMode.gameStart_MovingMode.gameStop = true;
							gamePan_MovingMode.gameMainFrame.remove(gamePan_MovingMode);
							gamePan_MovingMode.gameMainFrame.GameOverPanel_show(gamePan_MovingMode.gameStart_MovingMode.point);
							gamePan_MovingMode.gameMainFrame.repaint();
						}
					}

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
	}
	
	public class Timer_TargetMoving extends Thread{
		
		Target_MovingMode target_MovingMode;
		
		@Override
		public void run() {
			while (true) {
				try {
					
					if(catchcatch) {
						break;
					}
					if(gamePan_MovingMode.gameStart_MovingMode.gameStop) {
						break;
					}
				
					int dx = r1.nextInt(5);
					int dy = r1.nextInt(5);
					int a = r1.nextInt(3);
					
					if (a == 0) {
						dx = 10;
						dy = 10;
					} else if (a== 1) {
						dx = -10;
						dy = -10;
					} else if (a == 2) {
						dx = 10;
						dy = -10;
					}else if (a == 3) {
						dx = -10;
						dy = 10;
					}
					
					sleep(100);
					
					int targetmoveX = getX()+dx;
					int targetmoveY = getY()+dy;
					
					setLocation(targetmoveX, targetmoveY);
					
					gamePan_MovingMode.repaint();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	//			targetGen_MovingMode = new TargetGen_MovingMode();
	//			targetGen_MovingMode.start();
			}
		}
		
	}

}

