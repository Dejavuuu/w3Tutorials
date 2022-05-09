package snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame() {
		
		//Shortcut: 'this.add(new GamePanel());
		GamePanel panel = new GamePanel();
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		this.add(panel);
	}
}
