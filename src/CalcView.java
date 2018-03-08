import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcView extends JFrame {

	
	private JTextField firstNum = new JTextField(10);
	
	
	CalcView(){
		
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(800,600);
		
		calcPanel.add(firstNum);
		this.add(calcPanel);
	}
}
