package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class signup extends JFrame implements ActionListener {
    JRadioButton R1,R2 ,R3,R4;
    JTextField textName ,textFName, textFEmail , textFAddress  , textFCity, textFState, textFPinCode;
    JDateChooser dateChooser;
    JButton next;
    Random ran= new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first= " "+Math.abs(first4);
    signup(){
        super("Application form");

        JLabel label1=new JLabel("APPLICATION FORM NO.:"+first);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Raleway",Font.BOLD,32));
        label1.setBounds(20,20,500,40);
        add(label1);

        JLabel label2=new JLabel("Page:1 ");
        label2.setForeground(Color.black);
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(220,70,200,28);
        add(label2);

        JLabel label3=new JLabel("Personal Details: ");
        label3.setForeground(Color.black);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(20,95,500,40);
        add(label3);

        JLabel  labelName= new JLabel("Applicant's Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,15));
        labelName.setForeground(Color.black);
        labelName.setBounds(30,130,400,30);
        add(labelName);
        textName= new JTextField();
        textName.setFont(new Font("Raleway",Font.ITALIC,14));
        textName.setForeground(Color.black);
        textName.setBounds(170,137,200,16);
        add(textName);


        JLabel  labelFName= new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway",Font.BOLD,15));
        labelFName.setForeground(Color.black);
        labelFName.setBounds(30,150,400,30);
        add(labelFName);
        textFName= new JTextField();
        textFName.setFont(new Font("Raleway",Font.ITALIC,14));
        textFName.setForeground(Color.black);
        textFName.setBounds(170,157,200,16);
        add(textFName);

        JLabel  labelDOB= new JLabel("Date Of Birth :");
        labelDOB.setFont(new Font("Raleway",Font.BOLD,15));
        labelDOB.setForeground(Color.black);
        labelDOB.setBounds(30,170,400,30);
        add(labelDOB);

        dateChooser= new JDateChooser();
        dateChooser.setForeground(Color.blue);
        dateChooser.setBounds(170,177,200, 16);
        add(dateChooser);

        JLabel  labelGender= new JLabel("Gender: ");
        labelGender.setFont(new Font("Raleway",Font.BOLD,15));
        labelGender.setForeground(Color.black);
        labelGender.setBounds(30,190,400,30);
        add(labelGender);

        R1=new JRadioButton("Male");
        R1.setBackground(Color.white);
        R1.setFont(new Font ("Raleway", Font.BOLD, 14));
        R1.setForeground(Color.black);
        R1.setBounds(170, 197, 70,16);
        add(R1);

        R2=new JRadioButton("Female");
        R2.setBackground(Color.white);
        R2.setFont(new Font ("Raleway", Font.BOLD, 14));
        R2.setForeground(Color.black);
        R2.setBounds(250, 197, 90,16);
        add(R2);

        ButtonGroup btngrp= new ButtonGroup();
        btngrp.add(R1);
        btngrp.add(R2);

        JLabel labelEmail=new JLabel("Email address:");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,15));
        labelEmail.setForeground(Color.black);
        labelEmail.setBounds(30,215,200,18);
        add(labelEmail);

        textFEmail=new JTextField();
        textFEmail.setForeground(Color.black);
        textFEmail.setBounds(170,217,200,16);
        textFEmail.setBackground(Color.white);
        add(textFEmail);

        JLabel labelAddress=new JLabel("Address:");
        labelAddress.setFont(new Font("Raleway",Font.BOLD,15));
        labelAddress.setForeground(Color.black);
        labelAddress.setBounds(30,237,200,18);
        add(labelAddress);

        textFAddress=new JTextField();
        textFAddress.setForeground(Color.black);
        textFAddress.setBounds(170,237,200,16);
        textFAddress.setBackground(Color.white);
        add(textFAddress);

        JLabel labelMStat=new JLabel("Maritial Status:");
        labelMStat.setFont(new Font("Raleway",Font.BOLD,15));
        labelMStat.setForeground(Color.black);
        labelMStat.setBounds(30,260,220,18);
        add(labelMStat);

        R3=new JRadioButton("Married");
        R3.setBackground(Color.white);
        R3.setFont(new Font ("Raleway", Font.BOLD, 14));
        R3.setForeground(Color.black);
        R3.setBounds(170, 260, 90,16);
        add(R3);

        R4=new JRadioButton("Unmarried");
        R4.setBackground(Color.white);
        R4.setFont(new Font ("Raleway", Font.BOLD, 14));
        R4.setForeground(Color.black);
        R4.setBounds(270, 260, 100,16);
        add(R4);

        ButtonGroup btngrp1= new ButtonGroup();
        btngrp.add(R4);
        btngrp.add(R3);

        JLabel labelCity=new JLabel("City:");
        labelCity.setFont(new Font("Raleway",Font.BOLD,15));
        labelCity.setForeground(Color.black);
        labelCity.setBounds(30,280,200,18);
        add(labelCity);

        textFCity=new JTextField();
        textFCity.setForeground(Color.black);
        textFCity.setBounds(170,280,200,16);
        textFCity.setBackground(Color.white);
        add(textFCity);

        JLabel labelState=new JLabel("State:");
        labelState.setFont(new Font("Raleway",Font.BOLD,15));
        labelState.setForeground(Color.black);
        labelState.setBounds(30,300,200,18);
        add(labelState);

        textFState=new JTextField();
        textFState.setForeground(Color.black);
        textFState.setBounds(170,300,200,16);
        textFState.setBackground(Color.white);
        add(textFState);

        JLabel labelPhoneNO=new JLabel("Contact No.:");
        labelPhoneNO.setFont(new Font("Raleway",Font.BOLD,15));
        labelPhoneNO.setForeground(Color.black);
        labelPhoneNO.setBounds(30,320,200,18);
        add(labelPhoneNO);

        textFState=new JTextField();
        textFState.setForeground(Color.black);
        textFState.setBounds(170,320,200,16);
        textFState.setBackground(Color.white);
        add(textFState);

        JLabel labelPinCode=new JLabel("Pincode:");
        labelPinCode.setFont(new Font("Raleway",Font.BOLD,15));
        labelPinCode.setForeground(Color.black);
        labelPinCode.setBounds(30,340,200,18);
        add(labelPinCode);

        textFPinCode=new JTextField();
        textFPinCode.setForeground(Color.black);
        textFPinCode.setBounds(170,340,200,16);
        textFPinCode.setBackground(Color.white);
        add(textFPinCode);


        next=new JButton("Next >>");
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.ITALIC, 15));
        next.setBackground(Color.red);
        next.setBounds(200,380,100,30);
        next.addActionListener(this);
        add(next);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bgimg (1).jpg"));// this will load the image from the memory to the I1.
        Image i2=i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);// used to scale image
        ImageIcon i3 = new ImageIcon(i2);//reconvert scaled image into Image icon
        JLabel image = new JLabel(i3);// because directly we can not display image on the frame.
        image.setBounds(0,0,850,480);// it is used to alot dimensions where image will be visible.
        add(image);

        setLayout(null);
       setSize(850,480);
       setLocation(360,40);
       setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
    public static void main(String [] args){
     new signup();
    }
}

