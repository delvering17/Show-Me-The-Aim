package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModeSelectPanel extends JPanel implements ActionListener {
	JButton button_setMode ;
	JButton button_timeattackMode ;
	JButton button_infiMode ;
	JButton button_challengeMode ;
	JButton button_movingMode ;
	JButton button_skillshotMode ;
	
	GameMainFrame gameMainFrame;
	
	public ModeSelectPanel() {
		
		setBounds(0, 0, 800, 600);
		setLayout(null);
		setBackground(Color.gray);
		
		// mode 로고
		ImageIcon modeLogo_img = new ImageIcon("imageSample/aimgame/modeselect/modeSelect.png");
		
		JLabel modeLogo = new JLabel(modeLogo_img);
		modeLogo.setBounds(200,0,400,200);
		add(modeLogo);
		// 설정모드
		
		ImageIcon setMode_img = new ImageIcon("imageSample/aimgame/modeselect/setMode.png");
		button_setMode = new JButton("설정 모드", setMode_img);
		button_setMode.setBounds(50,250,200,100);
		button_setMode.setBackground(Color.gray);
		button_setMode.setOpaque(true);
		button_setMode.setBorderPainted(false);
		add(button_setMode);
		// 타임어택 모드
		ImageIcon timeattackMode_img = new ImageIcon("imageSample/aimgame/modeselect/timeattackMode.png");
		button_timeattackMode = new JButton("타임어택 모드",timeattackMode_img);
		button_timeattackMode.setBounds(300,250,200,100);
		button_timeattackMode.setBackground(Color.gray);
		button_timeattackMode.setOpaque(true);
		button_timeattackMode.setBorderPainted(false);
		add(button_timeattackMode);
		// 무한 모드
		ImageIcon infiMode_img = new ImageIcon("imageSample/aimgame/modeselect/infiMode.png");
		button_infiMode = new JButton("무한 모드", infiMode_img);
		button_infiMode.setBounds(550,250,200,100);
		button_infiMode.setBackground(Color.gray);
		button_infiMode.setOpaque(true);
		button_infiMode.setBorderPainted(false);
		add(button_infiMode);
		// 챌린지 모드
		ImageIcon challengeMode_img = new ImageIcon("imageSample/aimgame/modeselect/challengeMode.png");
		button_challengeMode = new JButton("챌린지 모드", challengeMode_img);
		button_challengeMode.setBounds(175,400,200,100);
		button_challengeMode.setBackground(Color.gray);
		button_challengeMode.setOpaque(true);
		button_challengeMode.setBorderPainted(false);
		add(button_challengeMode);
		// 무빙 모드
		ImageIcon movingMode_img = new ImageIcon("imageSample/aimgame/modeselect/movingMode.png");
		button_movingMode = new JButton("무빙 모드", movingMode_img);
		button_movingMode.setBounds(400,400,200,100);
		button_movingMode.setBackground(Color.gray);
		button_movingMode.setOpaque(true);
		button_movingMode.setBorderPainted(false);
		add(button_movingMode);

		
		button_setMode.addActionListener(this);
		button_timeattackMode.addActionListener(this);
		button_infiMode.addActionListener(this);
		
		button_challengeMode.addActionListener(this);
		button_movingMode.addActionListener(this);
		
	
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button_setMode) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_SetMode_SetPan_Show();
			gameMainFrame.repaint();
		}
		
		if(e.getSource() == button_timeattackMode) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_TimeAttackMode_Show();
			gameMainFrame.repaint();
		}
		if(e.getSource() == button_infiMode) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_show();
			gameMainFrame.repaint();
		}
		if(e.getSource() == button_challengeMode) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_ChallengeMode_Show();
			gameMainFrame.repaint();
		}
		if(e.getSource() == button_movingMode) {
			gameMainFrame.remove(this);
			gameMainFrame.GameStart_MovingMode_Show();
			gameMainFrame.repaint();
		}
	}

}
