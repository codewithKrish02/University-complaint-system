package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class faculty implements ActionListener
{
JFrame f;
JButton b1,b2;

JLabel l1,l2,l3,l4,l5,l6;
private JLabel lblTeaching;
private JLabel lblnonteaching;
private JTextField textField;
private JTextField textField_1;
faculty()
{

f=new JFrame("faculty");
f.getContentPane().setLayout(null);
f.getContentPane();

b1=new JButton("back");
b1.addActionListener(this);
b1.setBounds(57,63,85,33);
b2=new JButton("Register");
b2.addActionListener(this);
b2.setBounds(201,317,210,60);


b1.setBackground(new Color(100,200,0));
b1.setForeground(new Color(255,255,255));
b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));




f.getContentPane().add(b1);
f.getContentPane().add(b2);
lblTeaching = new JLabel("TEACHING:");
lblTeaching.setBounds(137, 166, 92, 16);
f.getContentPane().add(lblTeaching);
lblnonteaching = new JLabel("NON-TEACHING:");
lblnonteaching.setBounds(137, 221, 121, 16);
f.getContentPane().add(lblnonteaching);
textField = new JTextField();
textField.setBounds(310, 163, 190, 22);
f.getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(310, 218, 190, 22);
f.getContentPane().add(textField_1);

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
new faculty();
}
}
