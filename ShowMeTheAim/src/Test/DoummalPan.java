package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DoummalPan extends JPanel implements ActionListener {
	GameMainFrame gameMainFrame;

	JButton doummalOutButton ;
	JLabel doummalPan_Logo;
	JLabel doummalPan_Text;

	
	
	
	DoummalPan() {

		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		setBackground(Color.gray);
		
		ImageIcon doummalPan_Logo_img = new ImageIcon("imageSample/aimgame/mainMenu/doummal.png");
		
		doummalPan_Logo = new JLabel(doummalPan_Logo_img);	
		doummalPan_Logo.setBounds(300,0,200,100);
		add(doummalPan_Logo);


		
		ImageIcon doummalPan_Text_img = new ImageIcon("imageSample/aimgame/doummal/doummaltext.png");
		
		doummalPan_Text = new JLabel(doummalPan_Text_img);	
		doummalPan_Text.setBounds(100,80,650,500);
		add(doummalPan_Text);


		
		ImageIcon doummalPan_out_img = new ImageIcon("imageSample/aimgame/doummal/doummaloutButton.png");

		doummalOutButton = new JButton(doummalPan_out_img) ;
		doummalOutButton.setBounds(680,30,50,50);
		doummalOutButton.setBackground(Color.gray);
		doummalOutButton.setOpaque(true);
		doummalOutButton.setBorderPainted(false);
		add(doummalOutButton);
		
		
		// 1. 1초 간격으로 타겟이 생성되면 사라지기 전에 정확하게 클릭
		// 2. 타겟을 놓치면 Life 감소, 모두 감소하면 Game Over
		// 3. 다양한 모드로 자유롭게 연습

		doummalOutButton.addActionListener(this);
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == doummalOutButton ) {
			gameMainFrame.remove(this);
			gameMainFrame.MainMenuPanel_show();
			gameMainFrame.repaint();
		}
		
	}
	

//	
//	void doummalPan_point_show() {
//		if (doummalPan_point_100 != null) {
//			doummalPan_menupanel.remove(doummalPan_point_100);
//			doummalPan_menupanel.remove(doummalPan_point_10);
//			doummalPan_menupanel.remove(doummalPan_point_1);
//		}
//		doummalPan_menupanel.setLayout(null);
//		ImageIcon doummalPan_point_img = new ImageIcon("imageSample/aimgame/playpan/doummalPan_point.png");
//		
//		doummalPan_pointLogo = new JLabel(doummalPan_point_img);		
//		doummalPan_pointLogo.setBounds(0,0,50,50);
//		doummalPan_menupanel.add(doummalPan_pointLogo);	
//	
//		ImageIcon doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
//		switch (gameStart.point/100) {
//		
//		case 1 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/one.png");
//			break;
//		case 2 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/two.png");
//			break;
//		case 3 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/three.png");
//			break;
//		case 4 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/four.png");
//			break;
//		case 5 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/five.png");
//			break;
//		case 6 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/six.png");
//			break;
//		case 7 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/seven.png");
//			break;
//		case 8 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/eight.png");
//			break;
//		case 9 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/nine.png");
//			break;
//		case 0 :
//			doummalPan_point_100_img = new ImageIcon("imageSample/aimgame/playpan/zero.png");
//			break;
//		}
//		doummalPan_point_100 = new JLabel(doummalPan_point_100_img);
//
//
//		doummalPan_point_100.setBounds(80,0,50,50);
//		doummalPan_menupanel.add(doummalPan_point_100);
//		
//
//	
//	

	
}


