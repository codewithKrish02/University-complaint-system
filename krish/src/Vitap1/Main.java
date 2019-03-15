package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main implements ActionListener
{
JFrame f;
JButton b2,b4,b5;

ComplaintOn co ;
private JButton btnNewButton;
ContactDetails cd;

Main()
{

f=new JFrame("Main");
f.getContentPane().setLayout(null);
f.getContentPane();

b2=new JButton("complaint box");
b2.addActionListener(this);
b2.setBounds(315,123,210,60);
b4=new JButton("Contact details");
b4.addActionListener(this);
b4.setBounds(315,243,210,60);
b5=new JButton("Exit");
b5.addActionListener(this);
b5.setBounds(315,379,210,60);


b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));
b4.setBackground(new Color(100,200,0));
b4.setForeground(new Color(255,255,255));
b5.setBackground(new Color(100,200,0));
b5.setForeground(new Color(255,255,255));


b2.setMnemonic('F');
b4.setMnemonic('D');
b5.setMnemonic('E');



f.getContentPane().add(b2);
f.getContentPane().add(b4);
f.getContentPane().add(b5);

//f.getContentPane().add(imgL);
f.setSize(887,694);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b2)
{
f.setVisible(false);
new ComplaintOn();
}
if(e.getSource()==b4)
{
	f.setVisible(false);
	new ContactDetails();
}
if(e.getSource()==b5)
{
f.setVisible(false);
System.exit(0);
}
}
public static void main(String args[])
{
new Main();
}
}
