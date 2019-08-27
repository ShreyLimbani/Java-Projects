import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener{
	TextField tf1;
	Button one,two,three,four,five,six,seven,eight,nine,zero;
	Button add1, subtract1, equals, reset, mul, div;
	Float num1, num2, result;
	String op;
	Calculator()
	{
		
		addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
		tf1 = new TextField();
		tf1.setBounds(50, 50, 160, 60);
		tf1.setText("0.0");
		add(tf1);
		add1 = new Button("+");
		add1.setBounds(180,130,30,30);
		add1.addActionListener(this);
		add(add1);
		subtract1 = new Button("-");
		subtract1.setBounds(180, 170, 30, 30);
		subtract1.addActionListener(this);
		add(subtract1);
		mul = new Button("*");
		mul.setBounds(180,210,30,30);
		mul.addActionListener(this);
		add(mul);
		div = new Button("/");
		div.setBounds(180,250,30,30);
		div.addActionListener(this);
		add(div);
		equals = new Button("=");
		equals.setBounds(130, 250, 30, 30);
		equals.addActionListener(this);
		add(equals);
		reset = new Button("RESET");
		reset.setBounds(230, 130, 60, 30);
		reset.addActionListener(this);
		add(reset);
		one = new Button("1");
		one.setBounds(50, 210, 30, 30);
		one.addActionListener(this);
		add(one);
		two = new Button("2");
		two.setBounds(90, 210, 30, 30);
		two.addActionListener(this);
		add(two);
		three = new Button("3");
		three.setBounds(130, 210, 30, 30);
		three.addActionListener(this);
		add(three);
		four = new Button("4");
		four.setBounds(50, 170, 30, 30);
		four.addActionListener(this);
		add(four);
		five = new Button("5");
		five.setBounds(90, 170, 30, 30);
		five.addActionListener(this);
		add(five);
		six = new Button("6");
		six.setBounds(130, 170, 30, 30);
		six.addActionListener(this);
		add(six);
		seven = new Button("7");
		seven.setBounds(50, 130, 30, 30);
		seven.addActionListener(this);
		add(seven);
		eight = new Button("8");
		eight.setBounds(90, 130, 30, 30);
		eight.addActionListener(this);
		add(eight);
		nine = new Button("9");
		nine.setBounds(130, 130, 30, 30);
		nine.addActionListener(this);
		add(nine);
		zero = new Button("0");
		zero.setBounds(90, 250, 30, 30);
		zero.addActionListener(this);
		add(zero);
		setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String arg = ae.getActionCommand();
		switch (arg)
		{
			case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "0":
				float digit = Float.parseFloat(arg);
				float num = Float.parseFloat(tf1.getText());
				num = num*10 + digit;
				String text = String.valueOf(num);
				tf1.setText(text);
				break;
			case "+": case"-": case "*": case"/":
				num1 = Float.valueOf(tf1.getText());
				op = arg;
				tf1.setText("0.0");
				break;
			case "=":
				num2 = Float.valueOf(tf1.getText());
				if(op == "+")
					result = num1 + num2;
				else if(op == "-")
					result = num1 - num2;
				else if(op == "*")
					result = num1 * num2;
				else if(op == "/")
					result = num1 / num2;
				tf1.setText(String.valueOf(result));
				break;
			case "RESET":
				num1=Float.parseFloat(String.valueOf(0.0));
				num2=Float.parseFloat(String.valueOf(0.0));
				tf1.setText("0.0");
		}
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setSize(320, 300);
		c1.setVisible(true);
	}
}
