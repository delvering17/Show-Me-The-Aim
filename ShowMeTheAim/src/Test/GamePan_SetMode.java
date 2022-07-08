package Test;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePan_SetMode extends JPanel {
	GameMainFrame gameMainFrame;
	JLabel gamepan_pointLogo;
	JLabel gamepan_timeLogo ;
	JLabel gamepan_lifeLogo ;
	
	JLabel gamepan_point;
	JLabel gamepan_point_100 ;
	JLabel gamepan_point_10;
	JLabel gamepan_point_1;
	
	JLabel gamepan_time ;
	
	JLabel gamepan_life;
	JLabel gamepan_life_100 ;
	JLabel gamepan_life_10;
	JLabel gamepan_life_1;
	
	JPanel gamePan_menupanel ;
	
	TargetGen_SetMode targetGen_SetMode;//
	Target_SetMode target_SetMode;
	//TargetInvisible targetInvisible;
	
	GameStart_SetMode gameStart_SetMode;

	
	
	
	GamePan_SetMode(GameMainFrame gameMainFrame) {
		this.gameMainFrame = gameMainFrame;
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		setBackground(Color.gray);
		
		
		
	
		
		// 시간
		
		
		// Life
		
	
		
		

		
	}
	
	void gamePan_menu () {
		// gamepan 메뉴패널
		gamePan_menupanel = new JPanel();
		gamePan_menupanel.setBounds(0,0,800,50);
		gamePan_menupanel.setLayout(null);
		
		// 메뉴패널 점수
		gamePan_point_show();
		
		// 메뉴패널 시간
		ImageIcon gamepan_time_img = new ImageIcon("imageSample/aimgame/playpan/gamepan_time.png");
		
		gamepan_timeLogo = new JLabel(gamepan_time_img);	
		gamepan_timeLogo.setBounds(300,0,50,50);
		gamePan_menupanel.add(gamepan_timeLogo);
		
		// 메뉴패널 라이프
		gamePan_life_show();
		
		// 
		// 점수, 시간, 라이프의 값이 일로 와야함 
		
		
		add(gamePan_menupanel);
		
	

	}
	
	void gamePan_point_show() {
		if (gamepan_point_100 != null) {
			gamePan_menupanel.remove(gamepan_point_100);
			gamePan_menupanel.remove(gamepan_point_10);
			gamePan_menupanel.remove(gamepan_point_1);
		}
		gamePan_menupanel.setLayout(null);
		ImageIcon gamepan_point_img = new ImageIcon("imageSample/aimgame/playpan/gamepan_point.png");
		
		gamepan_pointLogo = new JLabel(gamepan_point_img);		
		gamepan_pointLogo.setBounds(0,0,50,50);
		gamePan_menupanel.add(gamepan_pointLogo);	
	
		ImageIcon gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch (gameStart_SetMode.point/100) {
		
		case 1 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_point_100 = new JLabel(gamepan_point_100_img);


		gamepan_point_100.setBounds(80,0,50,50);
		gamePan_menupanel.add(gamepan_point_100);
		
		ImageIcon gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((gameStart_SetMode.point%100)/10) {
		
		case 1 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_point_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_point_10 = new JLabel(gamepan_point_10_img);
		
		gamepan_point_10.setBounds(110,0,50,50);
		gamePan_menupanel.add(gamepan_point_10);
		
		
		ImageIcon gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((gameStart_SetMode.point%10)) {
		
		case 1 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_point_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_point_1 = new JLabel(gamepan_point_1_img);

		gamepan_point_1.setBounds(140,0,50,50);
		gamePan_menupanel.add(gamepan_point_1);
		
		gamePan_menupanel.repaint();
	}
	
	
	
	void gamePan_life_show() {
		
		if (gamepan_life_100 != null) {
			gamePan_menupanel.remove(gamepan_life_100);
			gamePan_menupanel.remove(gamepan_life_10);
			gamePan_menupanel.remove(gamepan_life_1);
		}
		gamePan_menupanel.setLayout(null);
		
		ImageIcon gamepan_life_img = new ImageIcon("imageSample/aimgame/playpan/gamepan_life.png");
		
		gamepan_lifeLogo = new JLabel(gamepan_life_img);		
		gamepan_lifeLogo.setBounds(600,0,50,50);
		gamePan_menupanel.add(gamepan_lifeLogo);
	
		


		
	
		ImageIcon gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch (gameStart_SetMode.life/100) {
		
		case 1 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_life_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_life_100 = new JLabel(gamepan_life_100_img);

		
		gamepan_life_100.setBounds(680,0,50,50);
		gamePan_menupanel.add(gamepan_life_100);
		
		ImageIcon gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((gameStart_SetMode.life%100)/10) {
		
		case 1 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_life_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_life_10 = new JLabel(gamepan_life_10_img);
		gamepan_life_10.setBounds(710,0,50,50);
		gamePan_menupanel.add(gamepan_life_10);
		
		
		ImageIcon gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((gameStart_SetMode.life%10)) {
		
		case 1 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_life_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_life_1 = new JLabel(gamepan_life_1_img);
		gamepan_life_1.setBounds(740,0,50,50);
		gamePan_menupanel.add(gamepan_life_1);
		
		gamePan_menupanel.repaint();
	}
	
	
	
	
}


