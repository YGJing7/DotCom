import java.awt.event.*;
import javax.swing.*;


import java.awt.*;

public class SimpleGUI2 implements ActionListener {

	JFrame frame;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGUI2 gui = new SimpleGUI2();
		gui.go();
		
	}

	private void go() {
		// TODO Auto-generated method stub
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		
		
		JButton button = new JButton("change Color");
		c.add(BorderLayout.SOUTH, button);
		button.addActionListener(this);
		
		MyDrawPanel mypen = new MyDrawPanel();
		c.add(BorderLayout.CENTER, mypen);
		
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		frame.repaint();
	}

}
