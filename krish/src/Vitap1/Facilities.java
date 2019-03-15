package Vitap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Facilities implements ActionListener
{
JFrame f;
JButton b1,b2;

JLabel l1,l2,l3,l4,l5,l6;
private JLabel lblBusses;
private JLabel lblClassrooms;
private JLabel lblLab;
private JLabel lblWifi;
private JLabel lblLibrary;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
Facilities()
{

f=new JFrame("Facilities");
f.getContentPane().setLayout(null);
f.getContentPane();

b1=new JButton("back");
b1.addActionListener(this);
b1.setBounds(57,63,85,33);
b2=new JButton("Register");
b2.addActionListener(this);
b2.setBounds(249,449,210,60);


b1.setBackground(new Color(100,200,0));
b1.setForeground(new Color(255,255,255));
b2.setBackground(new Color(100,200,0));
b2.setForeground(new Color(255,255,255));




f.getContentPane().add(b1);
f.getContentPane().add(b2);
lblBusses = new JLabel("BUSSES:");
lblBusses.setBounds(137, 166, 92, 16);
f.getContentPane().add(lblBusses);
lblClassrooms = new JLabel("CLASSROOMS:");
lblClassrooms.setBounds(137, 221, 92, 16);
f.getContentPane().add(lblClassrooms);
lblLab = new JLabel("LAB:");
lblLab.setBounds(137, 274, 92, 16);
f.getContentPane().add(lblLab);
lblWifi = new JLabel("WIFI:");
lblWifi.setBounds(137, 321, 92, 16);
f.getContentPane().add(lblWifi);
lblLibrary = new JLabel("LIBRARY:");
lblLibrary.setBounds(137, 374, 92, 16);
f.getContentPane().add(lblLibrary);
textField = new JTextField();
textField.setBounds(310, 163, 190, 22);
f.getContentPane().add(textField);
textField.setColumns(10);
textField_1 = new JTextField();
textField_1.setColumns(10);
textField_1.setBounds(310, 218, 190, 22);
f.getContentPane().add(textField_1);
textField_2 = new JTextField();
textField_2.setColumns(10);
textField_2.setBounds(310, 271, 190, 22);
f.getContentPane().add(textField_2);
textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(310, 318, 190, 22);
f.getContentPane().add(textField_3);
textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(310, 371, 190, 22);
f.getContentPane().add(textField_4);

f.setSize(808,607);
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
new Facilities();
}
}
