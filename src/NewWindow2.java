import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewWindow2 implements ActionListener{
	
    private JFrame frame;
    JLabel label,genNum,userNum;
    private JPanel panel;
    JButton button;
    public NewWindow2() {
    	
        frame = new JFrame();

        label = new JLabel();
        label.setText("Generated number didn't match your input , Please try again !");
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        button = new JButton("Retry");
        button.setFont(new Font("Comic Sans", Font.BOLD, 14));
        button.setBounds(100,100,100,100);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.GRAY);
        button.setBorder(BorderFactory.createEmptyBorder());

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,100,100,100));
        panel.setLayout(new GridLayout(0,1,10,10));
        panel.setBackground(new Color(209, 204, 190));
        panel.add(label);
        panel.add(button);

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Result");
        frame.setSize(new Dimension(1000,400));
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

        frame.pack();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
           GUI gui = new GUI();
        }
    }
}