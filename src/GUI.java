import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

import java.util.Random;

public class GUI implements ActionListener{
	private int count= 0;
	private JFrame frame;
	private JLabel label,l,l1,ranNum;
	private JPanel panel;
	private JButton button;
	private JTextField textField1,textField2,textField3;
	Font font;
	int randomNumber = generateRandomNumber();
	int intNum;
	String text1;
	String text2;
	String text3;
	String num;
	
	public GUI() {
		
		font = new Font("MV Boli", Font.BOLD, 15);
		
		frame = new JFrame();
		
		textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(100,50));
		textField1.setBounds(100,100,100,100);
		text1 = textField1.getText();
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(100,50));
		textField2.setBounds(100,100,100,100);
		text2 = textField2.getText();
		textField3 = new JTextField();
		textField3.setPreferredSize(new Dimension(100,50));
		textField3.setBounds(100,100,100,100);
		text3 = textField3.getText();
		
		button = new JButton("Generate");
		button.setFont(new Font("Comic Sans", Font.BOLD, 14));
		button.setBounds(100,100,100,100);
		button.addActionListener(this);
		button.setFocusable(false);
		button.setForeground(Color.WHITE);
		button.setBackground(Color.GRAY);
		button.setBorder(BorderFactory.createEmptyBorder());
		
		l= new JLabel(" ");
		l1= new JLabel(" ");
		ranNum = new JLabel("Generated Random Number: ");
		ranNum.setFont(font);
		label = new JLabel("Number of clicks: 0   ");
		label.setFont(new Font("MV Boli",Font.BOLD,15));
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50,100,100,100));
		panel.setLayout(new GridLayout(0,3,10,10));
		panel.setBackground(new Color(209, 204, 190));
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(l);
		panel.add(button);
		panel.add(l1);
		panel.add(label);
		panel.add(ranNum);
		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Check App");
		frame.setSize(new Dimension(1000,400));
		frame.setVisible(true);
		frame.add(panel, BorderLayout.CENTER);
		
		ImageIcon image = new ImageIcon("logo.png");
		frame.setIconImage(image.getImage());
		
		//frame.pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks:" + count);
		ranNum.setText("Generated Random Number :" + randomNumber);
		System.out.println(randomNumber);
		num = textField1.getText() + textField2.getText() + textField3.getText();
		System.out.println(num);
		intNum = stringToInt(num);
		if(e.getSource()==button && randomNumber == intNum ) {
			//frame.dispose();
			NewWindow myWindow = new NewWindow();
		}else {
			//frame.dispose();
			NewWindow2 mywindow2 = new NewWindow2();
		}
	}
	
	 public static int generateRandomNumber() {
	        Random random = new Random();
	        return random.nextInt(1000);
	 }
	 
	 /*public static void updateRandomNumber() {
		    generateRandomNumber();
	 }*/
	 
	  public static int stringToInt(String str) {
		  int result = 0;
		  try {
			  result = Integer.parseInt(str);
		  } catch (NumberFormatException e) {
		      System.out.println("Invalid input: " + str);
		    }
		  return result;
	  }
		

	 
}