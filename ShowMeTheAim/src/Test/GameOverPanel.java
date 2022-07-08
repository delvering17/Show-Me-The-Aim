package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOverPanel extends JPanel implements ActionListener{
	GameMainFrame gameMainFrame;
	
	
	JButton Button_overRetry ;
	JButton Button_overMainMenu ;
	
	JLabel gameover_point;
	JLabel gameover_time;
	
	JLabel gameover_point_100;
	JLabel gameover_point_10;
	JLabel gameover_point_1;
	
	int point;
	
	public GameOverPanel(int point) {
		this.point = point;
		setBounds(0, 0, 800, 600);
		setLayout(null);
		setBackground(Color.gray);
		
		// gameover 로고
		ImageIcon gameoverLogo_img = new ImageIcon("imageSample/aimgame/gameover/gameoverLogo.png");
		
		JLabel gameoverLogo = new JLabel(gameoverLogo_img);		// 나중에 이게 깜빡깜빡하면서 위에서 쿵하고내려왔음좋
		gameoverLogo.setBounds(200,0,400,200);
		add(gameoverLogo);
		
		// 점수
		ImageIcon overPoint_img = new ImageIcon("imageSample/aimgame/gameover/overPoint.png");
		JLabel overPointLogo = new JLabel(overPoint_img);
	
		overPointLogo.setBounds(30,120,400,200);
		add(overPointLogo);
		
		gameover_point = new JLabel();
	
		gameover_point.setBounds(400,200,50,50);
		add(gameover_point);
		gameover_point_show();
		
		
		// 시간(시간이필요없는 모드는 고민해봐야함 따로 만들지 스깔지)
//		ImageIcon overTime_img = new ImageIcon("imageSample/aimgame/gameover/overTime.png");
//		JLabel overTimeLogo = new JLabel(overTime_img);
//		overTimeLogo.setBounds(30,230,400,200);
//		add(overTimeLogo);
		
		// 재시작
		ImageIcon overRetry_img = new ImageIcon("imageSample/aimgame/gameover/overRetry.png");

		Button_overRetry = new JButton("재시작", overRetry_img);
		Button_overRetry.setBounds(180,400,200,100);
		Button_overRetry.setBackground(Color.gray);
		Button_overRetry.setOpaque(true);
		Button_overRetry.setBorderPainted(false);
		add(Button_overRetry);
		// 메인 메뉴
		ImageIcon overMainMenu_img = new ImageIcon("imageSample/aimgame/gameover/overMainmenu.png");
		Button_overMainMenu = new JButton("메인 메뉴", overMainMenu_img);
		Button_overMainMenu.setBounds(420,400,200,100);
		Button_overMainMenu.setBackground(Color.gray);
		Button_overMainMenu.setOpaque(true);
		Button_overMainMenu.setBorderPainted(false);
		add(Button_overMainMenu);
		
		Button_overRetry.addActionListener(this);
		Button_overMainMenu.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Button_overRetry) {
			gameMainFrame.remove(this);
			gameMainFrame.ModeSelectPanel_show();
			gameMainFrame.repaint();
		}
		if (e.getSource() == Button_overMainMenu) {
			
			gameMainFrame.remove(this);
			gameMainFrame.MainMenuPanel_show();
			gameMainFrame.repaint();
		}
		

	}
	
	void gameover_point_show() {
		
	
		ImageIcon gamepan_point_img = new ImageIcon("imageSample/aimgame/playpan/gamepan_point.png");
		
	
	
		ImageIcon gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch (point/100) {
		
		case 1 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gameover_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gameover_point_100 = new JLabel(gameover_point_100_img);


		gameover_point_100.setBounds(320,200,50,50);
		add(gameover_point_100);
		
		ImageIcon gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((point%100)/10) {
		
		case 1 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gameover_point_10_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gameover_point_10 = new JLabel(gameover_point_10_img);
		
		gameover_point_10.setBounds(350,200,50,50);
		add(gameover_point_10);
		
		
		ImageIcon gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
		switch ((point%10)) {
		
		case 1 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
			break;
		case 2 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
			break;
		case 3 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
			break;
		case 4 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
			break;
		case 5 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
			break;
		case 6 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
			break;
		case 7 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
			break;
		case 8 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
			break;
		case 9 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
			break;
		case 0 :
			gameover_point_1_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
			break;
		}
		gameover_point_1 = new JLabel(gameover_point_1_img);

		gameover_point_1.setBounds(380,200,50,50);
		add(gameover_point_1);
		
		repaint();
	}
	
}
