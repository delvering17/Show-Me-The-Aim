package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SetMode_SetPan extends JPanel implements ActionListener {
	GameMainFrame gameMainFrame;
	
	JLabel setPan_setLifeLogo;

	
	JLabel setPan_setLife;
	JLabel setPan_setLife_100 ;
	JLabel setPan_setLife_10;
	JLabel setPan_setLife_1;
	JButton setPan_setLifeUpButton;
	JButton setPan_setLifeDownButton;

	

	JLabel setPan_setGenTime;
	JLabel setPan_setGenTime_10;
	JLabel setPan_setGenTime_1;
	JButton setPan_setLGenTimeUpButton;
	JButton setPan_setLGenTimeDownButton;
	JLabel setPan_onjum;
	
	JLabel setPan_Logo;
	
	JButton setMode_startButton ;
	

	int life = 5;
	int genTime = 10 ;

	//TargetInvisible targetInvisible;
	


	
	// 1. 설정 모드 로고  !!!!!!!!
	// 2. 설정 라이프, 생성시간 !!!!!!!!!
	// 5. 설정 모드 셋패널로 연결 !!!!!!!!!!!
	// 3. 두 자리 숫자 올리고 내리고 버튼
	// 4. 게임시작 버튼
	// 5. 설정 모드 셋패널로 연결 !!!!
	// 6. 게임시작 버튼 연결
	
	// 스테이지 시작 전 알려주기 만들기
	
	// 만들어야 되는 것 
	// 점 온점 - 버튼 + - 버튼- - 도움말 X표시 - 스테이지 12345
	
	
	SetMode_SetPan() {
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		setBackground(Color.gray);
		
		
		
		setPan_menu ();
		

		
	}
	
	void setPan_menu () {

		// setPan_Logo
		ImageIcon setPan_Logo_img = new ImageIcon("imageSample/aimgame/modeselect/setMode.png");
		
		setPan_Logo = new JLabel(setPan_Logo_img);	
		setPan_Logo.setBounds(300,0,200,100);
		add(setPan_Logo);

		
		// setPan_setLife
		ImageIcon setPan_setLife_img = new ImageIcon("imageSample/aimgame/LIFE.png");
		
		setPan_setLife = new JLabel(setPan_setLife_img);	
		setPan_setLife.setBounds(100,150,200,100);
		add(setPan_setLife);
		
		
		ImageIcon setPan_setLifeUpButton_img = new ImageIcon("imageSample/aimgame/setMode/plus.png");
		setPan_setLifeUpButton = new JButton("", setPan_setLifeUpButton_img);
		setPan_setLifeUpButton.setBounds(510,180,50,50);
		setPan_setLifeUpButton.setBackground(Color.gray);
		setPan_setLifeUpButton.setOpaque(true);
		setPan_setLifeUpButton.setBorderPainted(false);
		add(setPan_setLifeUpButton);
		
		setPan_setLifeUpButton.addActionListener(this);
		
		ImageIcon setPan_setLifeDownButton_img = new ImageIcon("imageSample/aimgame/setMode/minus.png");
		setPan_setLifeDownButton = new JButton("", setPan_setLifeDownButton_img);
		setPan_setLifeDownButton.setBounds(330,180,50,50);
		setPan_setLifeDownButton.setBackground(Color.gray);
		setPan_setLifeDownButton.setOpaque(true);
		setPan_setLifeDownButton.setBorderPainted(false);
		add(setPan_setLifeDownButton);
		
		setPan_setLifeDownButton.addActionListener(this);		
		
		
		setPan_setLife_show();
		
		
		
		// setPan_setGenTime
		ImageIcon setPan_setGenTime_img = new ImageIcon("imageSample/aimgame/setMode_genspeed.png");
	
		setPan_setGenTime = new JLabel(setPan_setGenTime_img);	
		setPan_setGenTime.setBounds(100,250,200,100);
		add(setPan_setGenTime);

		ImageIcon setPan_onjum_img = new ImageIcon("imageSample/aimgame/setMode/onjum.png");
		
		setPan_onjum = new JLabel(setPan_onjum_img);	
		setPan_onjum.setBounds(420,290,50,50);
		add(setPan_onjum);
		
		ImageIcon setPan_setLGenTimeUpButton_img = new ImageIcon("imageSample/aimgame/setMode/plus.png");
		setPan_setLGenTimeUpButton = new JButton("", setPan_setLGenTimeUpButton_img);
		setPan_setLGenTimeUpButton.setBounds(510,280,50,50);
		setPan_setLGenTimeUpButton.setBackground(Color.gray);
		setPan_setLGenTimeUpButton.setOpaque(true);
		setPan_setLGenTimeUpButton.setBorderPainted(false);
		add(setPan_setLGenTimeUpButton);
		
		setPan_setLGenTimeUpButton.addActionListener(this);
		
		ImageIcon setPan_setLGenTimeDownButton_img = new ImageIcon("imageSample/aimgame/setMode/minus.png");
		setPan_setLGenTimeDownButton = new JButton("", setPan_setLGenTimeDownButton_img);
		setPan_setLGenTimeDownButton.setBounds(330,280,50,50);
		setPan_setLGenTimeDownButton.setBackground(Color.gray);
		setPan_setLGenTimeDownButton.setOpaque(true);
		setPan_setLGenTimeDownButton.setBorderPainted(false);
		add(setPan_setLGenTimeDownButton);
		
		setPan_setLGenTimeDownButton.addActionListener(this);	
		
		setPan_setGenTime_show();
		
		// 시간되면 시간 제한도  0 입력하면 무한.
	

		
		ImageIcon setPan_startButton_img = new ImageIcon("imageSample/aimgame/mainMenu/gameStart.png");
		setMode_startButton = new JButton("", setPan_startButton_img);
		setMode_startButton.setBounds(300,400,200,100);
		setMode_startButton.setBackground(Color.gray);
		setMode_startButton.setOpaque(true);
		setMode_startButton.setBorderPainted(false);
		add(setMode_startButton);
		
		setMode_startButton.addActionListener(this);
		
		
	}
	
	
	void setPan_setLife_show() {
		
		if (setPan_setLife_10 != null) {
		remove(setPan_setLife_10);
		remove(setPan_setLife_1);
	}


		ImageIcon setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((life%100)/10) {
		
		case 1 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			setPan_setLife_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		setPan_setLife_10 = new JLabel(setPan_setLife_10_img);
		
		setPan_setLife_10.setBounds(400,180,50,50);
		add(setPan_setLife_10);
		
		
		ImageIcon setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((life%10)) {
		
		case 1 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			setPan_setLife_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		setPan_setLife_1 = new JLabel(setPan_setLife_1_img);

		setPan_setLife_1.setBounds(430,180,50,50);
		add(setPan_setLife_1);
		
		repaint();
	}
	
	
	void setPan_setGenTime_show() {
		
		if (setPan_setGenTime_10 != null) {
		remove(setPan_setGenTime_10);
		remove(setPan_setGenTime_1);
	}


		ImageIcon setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((genTime%100)/10) {
		
		case 1 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			setPan_setGenTime_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		setPan_setGenTime_10 = new JLabel(setPan_setGenTime_10_img);
		
		setPan_setGenTime_10.setBounds(400,280,50,50);
		add(setPan_setGenTime_10);
		
		
		ImageIcon setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((genTime%10)) {
		
		case 1 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			setPan_setGenTime_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		setPan_setGenTime_1 = new JLabel(setPan_setGenTime_1_img);

		setPan_setGenTime_1.setBounds(440,280,50,50);
		add(setPan_setGenTime_1);
		
		repaint();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == setMode_startButton ) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_SetMode_Show(life, genTime);
			gameMainFrame.repaint();
		}
		if(e.getSource() == setPan_setLifeUpButton ) {
			if (life != 99) {
				life += 1;
				setPan_setLife_show();
			}
			
		}
		
		if(e.getSource() == setPan_setLifeDownButton ) {
			if (life != 1) {
				life -= 1;
				setPan_setLife_show();
			}
		
		}
		if(e.getSource() == setPan_setLGenTimeUpButton ) {
			if (genTime != 99) {
				genTime ++;
				setPan_setGenTime_show();
			}
	
		}
		if(e.getSource() == setPan_setLGenTimeDownButton ) {
			if (genTime != 1) {
				genTime --;
				setPan_setGenTime_show();
			}
		
		}
	}	

}
