import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Breton");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(600, 300);
		myFrame.setSize(300, 200);

		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
        //branch 'master' of https://github.com/hectbp/lab3-hectbp.git
		myFrame.setVisible(true);
		//
	}
}