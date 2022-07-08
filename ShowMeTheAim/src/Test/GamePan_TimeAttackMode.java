package Test;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePan_TimeAttackMode extends JPanel {
	GameMainFrame gameMainFrame;
	JLabel gamepan_pointLogo;
	JLabel gamepan_timeLogo ;
	JLabel gamepan_lifeLogo ;
	
	JLabel gamepan_point;
	JLabel gamepan_point_100 ;
	JLabel gamepan_point_10;
	JLabel gamepan_point_1;
	
	JLabel gamepan_time ;
	

	JLabel gamepan_time_100 ;
	JLabel gamepan_time_10;
	JLabel gamepan_time_1;
	
	JPanel gamePan_menupanel ;
	
	int time = 60;
	
	GameStart_TimeAttackMode gameStart_TimeAttackMode;

	
	
	
	GamePan_TimeAttackMode(GameMainFrame gameMainFrame) {
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
		
		gamePan_time_show();
		// 메뉴패널 라이프
		
		
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
		switch (gameStart_TimeAttackMode.point/100) {
		
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
		switch ((gameStart_TimeAttackMode.point%100)/10) {
		
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
		switch ((gameStart_TimeAttackMode.point%10)) {
		
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
	
	
	
	void gamePan_time_show() {
		
		if (gamepan_time_100 != null) {
			gamePan_menupanel.remove(gamepan_time_100);
			gamePan_menupanel.remove(gamepan_time_10);
			gamePan_menupanel.remove(gamepan_time_1);
		}
		gamePan_menupanel.setLayout(null);
	
		ImageIcon gamepan_time_img = new ImageIcon("imageSample/aimgame/playpan/gamepan_time.png");
		
		gamepan_timeLogo = new JLabel(gamepan_time_img);		
		gamepan_timeLogo.setBounds(600,0,50,50);
		gamePan_menupanel.add(gamepan_timeLogo);
	
		


		
	
		ImageIcon gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch (time/100) {
		
		case 1 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_time_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_time_100 = new JLabel(gamepan_time_100_img);

		
		gamepan_time_100.setBounds(680,0,50,50);
		gamePan_menupanel.add(gamepan_time_100);
		
		ImageIcon gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((time%100)/10) {
		
		case 1 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_time_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_time_10 = new JLabel(gamepan_time_10_img);
		gamepan_time_10.setBounds(710,0,50,50);
		gamePan_menupanel.add(gamepan_time_10);
		
		
		ImageIcon gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((time%10)) {
		
		case 1 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gamepan_time_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gamepan_time_1 = new JLabel(gamepan_time_1_img);
		gamepan_time_1.setBounds(740,0,50,50);
		gamePan_menupanel.add(gamepan_time_1);
		
		gamePan_menupanel.repaint();
	}
	
	
	
	
}


