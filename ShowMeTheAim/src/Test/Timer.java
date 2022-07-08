package Test;
import javax.swing.JLabel;


public class Timer extends Thread{
	


	

	JLabel timeLB = new JLabel();

	@Override
	public void run() {
		
		while(true) {
			
			int i = 0;
				
			try {
				sleep(1000);
				
				timeLB.setText("시간:" +i);
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			
			
		}
		
		
	}
}
