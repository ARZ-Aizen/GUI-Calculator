package calcu;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class gui implements ActionListener {

	JFrame frame;
	JTextField display;
	JButton num0, num1, num2, num3, num4, num5, num6, num7, num8, num9; 
	JButton addition, subtraction, multiplication, division, clear, equal, delete;
	
	double val1 = 0, val2 = 0, resultVal = 0;
	char operator;
	
	public static void main(String[] args) {
		new gui();
	}
	
	public gui () {
		
		 frame = new JFrame();
			frame.setTitle("Calculator");
			frame.setLayout(null);
			frame.setSize(450, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			
		 JLabel label = new JLabel();
			label.setText("Calculator");
			label.setBounds(200,5,60,60);
			frame.add(label);
			
		display = new JTextField();
			display.setBounds(20, 65, 400, 70);
			display.setHorizontalAlignment(JTextField.RIGHT);
			display.setFont(new Font("Sans-serif", Font.BOLD, 20));
			display.setEditable(false);
			frame.add(display);
		
		clear = new JButton("C");
			clear.setBounds(345, 140, 65, 30);
			clear.addActionListener(this);
			frame.add(clear);
		
		num0 = new JButton("0");
			num0.setBounds(25, 180, 65, 65);
			num0.addActionListener(this);
			frame.add(num0);

		num1 = new JButton("1");
			num1.setBounds(105, 180, 65, 65);
			num1.addActionListener(this);
			frame.add(num1);

		num2 = new JButton("2");
			num2.setBounds(185, 180, 65, 65);
			num2.addActionListener(this);
			frame.add(num2);

		num3 = new JButton("3");
			num3.setBounds(265, 180, 65, 65);
			num3.addActionListener(this);
			frame.add(num3);

		num4 = new JButton("4");
			num4.setBounds(25, 250, 65, 65);
			num4.addActionListener(this);
			frame.add(num4);

		num5 = new JButton("5");
			num5.setBounds(105, 250, 65, 65);
			num5.addActionListener(this);
			frame.add(num5);

		num6 = new JButton("6");
			num6.setBounds(185, 250, 65, 65);
			num6.addActionListener(this);
			frame.add(num6);

		num7 = new JButton("7");
			num7.setBounds(265, 250, 65, 65);
			num7.addActionListener(this);
			frame.add(num7);

		num8 = new JButton("8");
			num8.setBounds(25, 320, 65, 65);
			num8.addActionListener(this);
			frame.add(num8);

		num9 = new JButton("9");
			num9.setBounds(105, 320, 65, 65);
			num9.addActionListener(this);
			frame.add(num9);
			
		addition = new JButton("+");
			addition.setBounds(345, 180, 65, 65);
			addition.addActionListener(this);
			frame.add(addition);
			
		subtraction = new JButton("-");
			subtraction.setBounds(345, 250, 65, 65);
			subtraction.addActionListener(this);
			frame.add(subtraction);
			
		multiplication = new JButton("x");
			multiplication.setBounds(185, 320, 65, 65 );
			multiplication.addActionListener(this);
			frame.add(multiplication);
			
		division = new JButton("/");
			division.setBounds(265, 320, 65, 65 );
			division.addActionListener(this);
			frame.add(division);
		
		equal = new JButton("=");
			equal.setBounds(345, 320, 65, 65);
			equal.addActionListener(this);
			frame.add(equal);
				
		frame.setVisible(true);
		
		 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== num0) display.setText(display.getText().concat("0"));
		if(e.getSource()== num1) display.setText(display.getText().concat("1"));
		if(e.getSource()== num2) display.setText(display.getText().concat("2"));
		if(e.getSource()== num3) display.setText(display.getText().concat("3"));
		if(e.getSource()== num4) display.setText(display.getText().concat("4"));
		if(e.getSource()== num5) display.setText(display.getText().concat("5"));
		if(e.getSource()== num6) display.setText(display.getText().concat("6"));
		if(e.getSource()== num7) display.setText(display.getText().concat("7"));
		if(e.getSource()== num8) display.setText(display.getText().concat("8"));
		if(e.getSource()== num9) display.setText(display.getText().concat("9"));
		
		if(e.getSource() == addition) {
			val1 = Double.parseDouble(display.getText());
			operator = '+';
			display.setText("");
		}
		
		if(e.getSource() == subtraction) {
			val1 = Double.parseDouble(display.getText());
			operator = '-';
			display.setText("");
		}
		
		if(e.getSource() == multiplication) {
			val1 = Double.parseDouble(display.getText());
			operator = '*';
			display.setText("");
		}
		if(e.getSource() == division) {
			val1 = Double.parseDouble(display.getText());
			operator = '/';
			display.setText("");
		}	
		
		if(e.getSource()== clear) {
			display.setText("");
			val1 = 0;
			val2 = 0;
		}

		if(e.getSource() == equal) {
			val2 = Double.parseDouble(display.getText());
			
			switch (operator) {
			case '+':
				resultVal = val1 + val2;
				break;
			case '-':
				resultVal = val1 - val2;
				break;
			case '*':
				resultVal = val1 * val2;
				break;
			case '/':
				resultVal = val1 / val2;
				break;
			}
		
		display.setText(String.valueOf(resultVal));
		val1 = resultVal;
		}
	}
}

