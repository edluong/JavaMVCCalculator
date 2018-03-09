import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.awt.GridLayout;

public class CalcView extends JFrame {

	
	//private JTextField firstNum = new JTextField(10);
	private JLabel label = new JLabel("0");
	private JButton one = new JButton("1");
	
	CalcView(){
		
		//Initialize the Panel with settings
		JPanel calcPanel = new JPanel();
		calcPanel.setLayout(new BoxLayout(calcPanel,BoxLayout.Y_AXIS));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(800,600);
		
		//button settings
		label.setBounds(0,0,100,20);
		label.setFont(new Font("Serif",Font.BOLD,14));
		
		//Add the other objects
		//calcPanel.add(firstNum);
		calcPanel.add(label);
		calcPanel.add(one);
		
		label.setAlignmentX(CENTER_ALIGNMENT);
		one.setAlignmentX(CENTER_ALIGNMENT);
		this.add(calcPanel);
		
		
	}
}
