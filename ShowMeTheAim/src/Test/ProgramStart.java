package Test;

public class ProgramStart {

	GameMainFrame gameMainFrame ;
	
	public ProgramStart() {
		Frame_show();
	}
	
	
	public static void main(String[] args) {

		new ProgramStart();
	}
	
	
	void Frame_show() {
		gameMainFrame = new GameMainFrame();
	}
	

}
