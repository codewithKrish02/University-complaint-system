package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class security implements ActionListener
{
JFrame f;
JButton b1,b2;

JLabel l1,l2,l3,l4,l5,l6;
private JLabel lblSecurity;
private JTextField textField;
security()
{

f=new JFrame("security");
f.getContentPane().setLayout(null);
f.getContentPane();

b1=new JButton("back");
b1.addActionListener(this);
b1.setBounds(57,63,85,33);
b2=new JButton("Register");
b2.addActionListener(this);
b2.setBounds(194,249,210,60);


b1.setBackground(new Color(100,200,0));
b1.setForeground(new Color(255,255,255));
b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));




f.getContentPane().add(b1);
f.getContentPane().add(b2);
lblSecurity = new JLabel("SECURITY:");
lblSecurity.setBounds(137, 166, 92, 16);
f.getContentPane().add(lblSecurity);
textField = new JTextField();
textField.setBounds(310, 163, 190, 22);
f.getContentPane().add(textField);
textField.setColumns(10);

f.setSize(634,476);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
f.setVisible(false);
new ComplaintOn();
}
if(e.getSource()==b2)
{

}
}
public static void main(String args[])
{
new security();
}
}
