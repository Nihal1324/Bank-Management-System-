package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {//JFrame comes from swing package.
    JLabel label1,label2,label3;
    JTextField textfield1 ;
    JPasswordField passwordField;
    JButton btn1,btn2,btn3;

    Login(){
        super("Bank Management System");// this title will be  shown in the top of the frame.

        label1 = new JLabel(" Welcome to the ATM ");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGrade",Font.ITALIC,38));
        label1.setBounds(60,70,450,40);
        add(label1);

        label2 = new JLabel("Card Number :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("AvantGrade",Font.BOLD,18));
        label2.setBounds(80,150,450,40);
        add(label2);

        textfield1=new JTextField(15);
        textfield1.setBounds(80,185,250,25);
        textfield1.setFont(new Font("Arial",Font.BOLD,14));
        add(textfield1);

        label3 = new JLabel("PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("AvantGrade",Font.BOLD,18));
        label3.setBounds(80,210,450,40);
        add(label3);

        passwordField =new JPasswordField(4);
        passwordField.setBounds(80,245,50,25);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);

        btn1=new JButton("Log in");
        btn1.setBounds(80,300,80,25);
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.cyan);
        btn1.setFont(new Font("Arial", Font.ITALIC,15));
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("Sign-Up");
        btn2.setBounds(170,300,100,25);
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.cyan);
        btn2.setFont(new Font("Arial", Font.ITALIC,15));
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("CLEAR");
        btn3.setBounds(130,340,90,20);
        btn3.setForeground(Color.white);
        btn3.setBackground(Color.red);
        btn3.setFont(new Font("Arial", Font.ITALIC,15));
        btn3.addActionListener(this);
        add(btn3);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bbgimg.jpg"));// this will load the image from the memory to the I1.
        Image i2=i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);// used to scale image
        ImageIcon i3 = new ImageIcon(i2);//reconvert scaled image into Image icon
        JLabel image = new JLabel(i3);// because directly we can not display image on the frame.
        image.setBounds(0,0,850,480);// it is used to alot dimensions where image will be visible.
        add(image);



        setLayout(null);
        setSize(850,480);//Set the Size of the frame
        setLocation(450,200);//set the location of frame
        setVisible(true);//to make frame visible
    }
     @Override
     public void actionPerformed(ActionEvent e){
       try{
         if(e.getSource()==btn1){

         }
         else if(e.getSource()==btn2){
                 setVisible(false); // Hide login window
                 new signup();      // Open signup window
         }
         else {
           textfield1.setText("");
           passwordField.setText("");
           }
       }
       catch(Exception E){
           E.printStackTrace();
         }
     }
    public static void main(String[] args){
      new Login();
    }
}