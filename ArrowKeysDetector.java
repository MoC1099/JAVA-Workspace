package projects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArrowKeysDetector {

	public ArrowKeysDetector() {
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();

		JLabel up = new JLabel();
		JLabel down = new JLabel();
		JLabel right = new JLabel();
		JLabel left = new JLabel();
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);

		
		up.setText("Up: 0");
		down.setText("Down: 0");
		left.setText("Left; 0");
		right.setText("Right: 0");
	
		
		frame.addKeyListener(new KeyListener() {
			int upKey = 0;
			int downKey = 0;
			int leftKey =0;
			int rightKey =0;

			
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch(keyCode) {
				case KeyEvent.VK_UP:
					up.setText("Up: " + Integer.toString( upKey++));
					break;
					
				case KeyEvent.VK_DOWN:
					down.setText("Down: " + Integer.toString( downKey++));
					break;
				case KeyEvent.VK_LEFT:
					left.setText("Left: " + Integer.toString( leftKey++));
					break;
				case KeyEvent.VK_RIGHT:
					right.setText("Right: " + Integer.toString( rightKey++));
					break;
				}

			
		}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.add(panel);

	}
	public static void main(String[] args) {
		new ArrowKeysDetector();
	}
}
