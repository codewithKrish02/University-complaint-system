package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ContactDetails implements ActionListener
{
JFrame f1;
private JFrame f1_1;
JLabel imgL1;
ImageIcon img1;
private JButton btnBack;
ContactDetails()
{

f1=new JFrame("ContactDetails");
f1.getContentPane().setLayout(null);
f1.getContentPane();

f1_1=new JFrame();
f1_1.getContentPane().setLayout(null);
f1_1.getContentPane();

img1=new ImageIcon("C:\\java\\java clg\\eclipse\\krish\\src\\Vitap\\Screenshot (2).png");
imgL1=new JLabel(img1);
imgL1.setBounds(24,115,1164,838);

f1_1.getContentPane().add(imgL1);
btnBack = new JButton("back");
btnBack.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		f1_1.setVisible(false);
		new Main();
		
	}
});
btnBack.setBounds(30, 35, 97, 25);
f1_1.getContentPane().add(btnBack);
f1_1.setSize(1300,1000);


f1_1.setSize(1300,1000);
f1_1.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

}
public static void main(String args[])
{
new ContactDetails();
}
}
