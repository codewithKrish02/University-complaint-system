package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ComplaintOn implements ActionListener
{
JFrame f;
JButton b2,b3,b4,b5;

Facilities fc;
private JButton btnNewButton;
faculty c;
security cd;
private JButton btnNewButton_1;

ComplaintOn()
{

f=new JFrame("complaint on");
f.getContentPane().setLayout(null);
f.getContentPane();

b2=new JButton("Facilities");
b2.addActionListener(this);
b2.setBounds(150,390,210,60);
b3=new JButton("Faculty");
b3.addActionListener(this);
b3.setBounds(150,490,210,60);
b4=new JButton("Security");
b4.addActionListener(this);
b4.setBounds(580,390,210,60);
b5=new JButton("Exit");
b5.addActionListener(this);
b5.setBounds(580,490,210,60);


b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));
b3.setBackground(new Color(100,200,0));
b3.setForeground(new Color(255,255,255));
b4.setBackground(new Color(100,200,0));
b4.setForeground(new Color(255,255,255));
b5.setBackground(new Color(100,200,0));
b5.setForeground(new Color(255,255,255));


b2.setMnemonic('F');
b3.setMnemonic('C');
b4.setMnemonic('D');
b5.setMnemonic('E');



f.getContentPane().add(b2);
f.getContentPane().add(b3);
f.getContentPane().add(b4);
f.getContentPane().add(b5);
btnNewButton_1 = new JButton("back");
btnNewButton_1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		f.setVisible(false);
		new Main();
	}
});
btnNewButton_1.setBounds(66, 69, 97, 25);
f.getContentPane().add(btnNewButton_1);

//f.getContentPane().add(imgL);
f.setSize(1300,1000);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b2)
{
f.setVisible(false);
fc=new Facilities();
}
if(e.getSource()==b3)
{
f.setVisible(false);
c=new faculty();
}
if(e.getSource()==b4)
{
	f.setVisible(false);
cd=new security();
}
if(e.getSource()==b5)
{
f.setVisible(false);
System.exit(0);
}
}
public static void main(String args[])
{
new ComplaintOn();
}
}
