import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;

public class BasicCalculator extends Frame implements ActionListener {
	Button add1, subtract1, mul, div, chngColor;
	TextField tf1, tf2, result;
	Label l1, l2, l3;
	String str;
	public BasicCalculator() {  
			addWindowListener(new java.awt.event.WindowAdapter() {
			            public void windowClosing(java.awt.event.WindowEvent e) {
			                System.exit(0);
			            }
			        });
		setTitle("Basic Calculator");
		l1 = new Label("Enter Number1");
		l2 = new Label("Enter Number2");
		l1.setBounds(50, 50, 110, 40);
		l2.setBounds(50, 100, 110, 40);
		add(l1);
		add(l2);
		l3 = new Label("Result");
		l3.setBounds(50, 150, 70, 40);
		add(l3);
		tf1 = new TextField();
		tf1.setBounds(170, 50, 70, 40);
		tf2 = new TextField();
		tf2.setBounds(170, 100, 70, 40);
		result = new TextField();
		result.setBounds(170, 150, 70, 40);
		add(tf1);
		add(tf2);
		add(result);
		add1 = new Button("ADD");
		add1.setBounds(70, 220, 70, 40);
		add(add1);
		subtract1 = new Button("SUBTRACT");
		subtract1.setBounds(150, 220, 70, 40);
		add(subtract1);
		add1.addActionListener(this);
		subtract1.addActionListener(this);
		mul = new Button("MULTIPLY");
		mul.setBounds(230, 220, 70, 40);
		add(mul);
		div = new Button("DIVIDE");
		div.setBounds(310, 220, 70, 40);
		add(div);
		mul.addActionListener(this);
		div.addActionListener(this);
		chngColor = new Button("Change Color");
		chngColor.setBounds(230, 400, 100, 40);
		add(chngColor);
		chngColor.addActionListener(this);
		setBackground(Color.BLUE);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String arg = ae.getActionCommand();
		if(arg.equals("ADD"))
		{
			Float sum = Float.parseFloat(tf1.getText()) + Float.parseFloat(tf2.getText());
			str = String.valueOf(sum);
		}
		else if(arg.equals("SUBTRACT"))
		{
			Float sub = Float.parseFloat(tf1.getText()) - Float.parseFloat(tf2.getText());
			str = String.valueOf(sub);
		}
		else if(arg.equals("MULTIPLY"))
		{
			Float sub = Float.parseFloat(tf1.getText()) * Float.parseFloat(tf2.getText());
			str = String.valueOf(sub);
		}
		else if(arg.equals("DIVIDE"))
		{
			Float sub = Float.parseFloat(tf1.getText()) / Float.parseFloat(tf2.getText());
			str = String.valueOf(sub);
		}
		else if(arg.equals("Change Color"))
		{
			setBackground(Color.YELLOW);
		}
		repaint();
	}
	
	public void paint (Graphics g) {
		result.setText(str);
	}
	
	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		bc.setSize(700, 700);
		bc.setVisible(true);
	}
}
