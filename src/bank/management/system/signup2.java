package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame  {
    String formno;
    JComboBox comboBox,comboBox2,comboBox3, comboBox4,comboBox5;
    JButton next;
    JTextField textPAN , textAadhar;
    JRadioButton r1,r2 ,r3,r4;
    signup2(String first){
        super("Application form");
        JLabel label1=new JLabel("APPLICATION FORM NO.:"+formno);
        label1.setForeground(Color.black);
        label1.setFont(new Font("Raleway",Font.BOLD,32));
        label1.setBounds(20,20,500,40);
        add(label1);

        JLabel label2=new JLabel("Page:2 ");
        label2.setForeground(Color.black);
        label2.setFont(new Font("Raleway",Font.BOLD,18));
        label2.setBounds(220,70,200,28);
        add(label2);
        JLabel label3=new JLabel("Additional Details:");
        label3.setForeground(Color.black);
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(20,95,500,40);
        add(label3);
        String[] religion ={
                "Hindu", "Muslim","Sikh", "Christan", "Others"
        };
        JLabel labelreligion= new JLabel("Religion:");
        labelreligion.setFont(new Font("Raleway",Font.BOLD,15));
        labelreligion.setForeground(Color.black);
        labelreligion.setBounds(30,130,400,30);
        add(labelreligion);

        comboBox= new JComboBox(religion);
        comboBox.setBackground(Color.white);
        comboBox.setFont(new Font("Raleway",Font.ITALIC,15));
        comboBox.setBounds(170,137,200,16);
        comboBox.setForeground(Color.black);
        add(comboBox);

        String[] Category= {
                "General","OBC","SC/ST"
        };
        JLabel  labelCategory= new JLabel("Category:");
        labelCategory.setFont(new Font("Raleway",Font.BOLD,15));
        labelCategory.setForeground(Color.black);
        labelCategory.setBounds(30,150,400,30);
        add(labelCategory);

        comboBox2= new JComboBox(Category);
        comboBox2.setBackground(Color.white);
        comboBox2.setFont(new Font("Raleway",Font.ITALIC,15));
        comboBox2.setBounds(170,157,200,16);
        comboBox2.setForeground(Color.black);
        add(comboBox2);

        String[] Income={
                "Null",
                "0-1,00,000",
                "1,00,000-3,00,000",
                "3,00,000-7,00,000",
                "7,00,000-1,00,000",
                "10,00,000- above"
        };
        JLabel  labelIncome= new JLabel("Income:");
        labelIncome.setFont(new Font("Raleway",Font.BOLD,15));
        labelIncome.setForeground(Color.black);
        labelIncome.setBounds(30,170,400,30);
        add(labelIncome);

        comboBox3= new JComboBox(Income);
        comboBox3.setBackground(Color.white);
        comboBox3.setFont(new Font("Raleway",Font.ITALIC,15));
        comboBox3.setBounds(170,177,200,16);
        comboBox3.setForeground(Color.black);
        add(comboBox3);

        String[] Education={
                "Non-Graduate",
                "Graduate",
                "UnderGraduate",
                "PostGraduate",
                "Doctorate",
                "Others"
        };

        JLabel  labelEducation= new JLabel("Education:");
        labelEducation.setFont(new Font("Raleway",Font.BOLD,15));
        labelEducation.setForeground(Color.black);
        labelEducation.setBounds(30,190,400,30);
        add(labelEducation);
        comboBox4= new JComboBox(Income);
        comboBox4.setBackground(Color.white);
        comboBox4.setFont(new Font("Raleway",Font.ITALIC,15));
        comboBox4.setBounds(170,197,200,16);
        comboBox4.setForeground(Color.black);
        add(comboBox4);

        String[] Occupation = {
                "Salaried",
                "Self-Employed",
                "Business",
                "Student",
                "Retired",
                "Housewife",
                "Unemployed",
                "Government Job",
                "Private Job",
                "Freelancer",
                "Others"
        };

        JLabel  labelOccupation= new JLabel("Occupation:");
        labelOccupation.setFont(new Font("Raleway",Font.BOLD,15));
        labelOccupation.setForeground(Color.black);
        labelOccupation.setBounds(30,210,400,30);
        add(labelOccupation);
        comboBox5= new JComboBox(Occupation);
        comboBox5.setBackground(Color.white);
        comboBox5.setFont(new Font("Raleway",Font.ITALIC,15));
        comboBox5.setBounds(170,217,200,16);
        comboBox5.setForeground(Color.black);
        add(comboBox5);

        JLabel  labelPAN= new JLabel("Pan Number:");
        labelPAN.setFont(new Font("Raleway",Font.BOLD,15));
        labelPAN.setForeground(Color.black);
        labelPAN.setBounds(30,230,400,30);
        add( labelPAN);

        textPAN=new JTextField();
        textPAN.setForeground(Color.black);
        textPAN.setBounds(170,237,200,16);
        textPAN.setBackground(Color.white);
        add(textPAN);

        JLabel  labelAadhar= new JLabel("Aadhar Number:");
        labelAadhar.setFont(new Font("Raleway",Font.BOLD,15));
        labelAadhar.setForeground(Color.black);
        labelAadhar.setBounds(30,250,400,30);
        add(labelAadhar);

        textAadhar=new JTextField();
        textAadhar.setForeground(Color.black);
        textAadhar.setBounds(170,257,200,16);
        textAadhar.setBackground(Color.white);
        add(textAadhar);

        JLabel  labelSenierCitizen= new JLabel("Senior Citizen:");
        labelSenierCitizen.setFont(new Font("Raleway",Font.BOLD,15));
        labelSenierCitizen.setForeground(Color.black);
        labelSenierCitizen.setBounds(30,270,400,30);
        add(labelSenierCitizen);

        r1=new JRadioButton("YES");
        r1.setBackground(Color.white);
        r1.setFont(new Font ("Raleway", Font.BOLD, 14));
        r1.setForeground(Color.black);
        r1.setBounds(170, 277, 90,16);
        add(r1);
        r2=new JRadioButton("NO");
        r2.setBackground(Color.white);
        r2.setFont(new Font ("Raleway", Font.BOLD, 14));
        r2.setForeground(Color.black);
        r2.setBounds(270, 277, 90,16);
        add(r2);
        ButtonGroup btngrp1= new ButtonGroup();
        btngrp1.add(r1);
        btngrp1.add(r2);

        JLabel  labelAlreadyAcc= new JLabel("Already Account:");
        labelAlreadyAcc.setFont(new Font("Raleway",Font.BOLD,15));
        labelAlreadyAcc.setForeground(Color.black);
        labelAlreadyAcc.setBounds(30,290,400,30);
        add(labelAlreadyAcc);

        r3=new JRadioButton("YES");
        r3.setBackground(Color.white);
        r3.setFont(new Font ("Raleway", Font.BOLD, 14));
        r3.setForeground(Color.black);
        r3.setBounds(170, 297, 90,16);
        add(r3);
        r4=new JRadioButton("NO");
        r4.setBackground(Color.white);
        r4.setFont(new Font ("Raleway", Font.BOLD, 14));
        r4.setForeground(Color.black);
        r4.setBounds(270, 297, 90,16);
        add(r4);
        ButtonGroup btngrp2= new ButtonGroup();
        btngrp2.add(r3);
        btngrp2.add(r4);


        next=new JButton("Next >>");
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.ITALIC, 15));
        next.setBackground(Color.red);
        next.setBounds(200,380,100,30);
//        next.addActionListener(this);
        add(next);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bgimg (1).jpg"));// this will load the image from the memory to the I1.
        Image i2=i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);// used to scale image
        ImageIcon i3 = new ImageIcon(i2);//reconvert scaled image into Image icon
        JLabel image = new JLabel(i3);// because directly we can not display image on the frame.
        image.setBounds(0,0,850,480);// it is used to alot dimensions where image will be visible.
        add(image);

        this.formno=formno;

        setLayout(null);
        setSize(850,480);
        setLocation(360,40);
        setVisible(true);

    }
//    @Override
//    public void actioPerformed(ActionEvent e) {
//
//    }
    public static void main(String [] arg){
        new signup2("");
    }
}
