package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuPanel extends JPanel implements ActionListener{
	JButton button_gameStart;
	JButton button_doummal;
	GameMainFrame gameMainFrame;
	
	boolean mainMenuPanel_out = false;
	public MainMenuPanel() {
		
		
		setBounds(0, 0, 800, 600);
		
	
		setLayout(null);
		
		setBackground(Color.gray);
		
		
		ImageIcon Logo_img = new ImageIcon("imageSample/aimgame/mainMenu/Logo.png");
		
		JLabel mainLogo = new JLabel(Logo_img);
		mainLogo.setBounds(200,0,400,200);
		add(mainLogo);
		
		
		
		
		
		ImageIcon gameStart_img = new ImageIcon("imageSample/aimgame/mainMenu/gameStart.png");
	
		button_gameStart = new JButton("",gameStart_img);
		button_gameStart.setBounds(300,300,200,100);
		button_gameStart.setBackground(Color.gray);
		button_gameStart.setOpaque(true);
		button_gameStart.setBorderPainted(false);
		
		add(button_gameStart);
		
		ImageIcon doummal_img = new ImageIcon("imageSample/aimgame/mainMenu/doummal.png");

		button_doummal = new JButton("", doummal_img);
		button_doummal.setBounds(300,420,200,100);
		button_doummal     .setBackground(Color.gray);
		button_doummal.setOpaque(true);
		button_doummal.setBorderPainted(false);
		
		
		add(button_doummal);
		
		
		button_gameStart.addActionListener(this);
		button_doummal.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if (e.getSource() == button_gameStart) {
			gameMainFrame.remove(this);
			gameMainFrame.ModeSelectPanel_show();
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
		}
		if (e.getSource() == button_doummal) {
			
			
			//일단 게임 오버에 연결 시킴 나중에 빼라 찬욱아
			gameMainFrame.remove(this);	
			gameMainFrame.DoummalPan_show(); // 이거 도움말로 교체해야 됨
			
			gameMainFrame.setBounds(50, 50, 800, 601);
			gameMainFrame.setBounds(50, 50, 800, 600);
		
			
		}
	}
	
	
	

}
