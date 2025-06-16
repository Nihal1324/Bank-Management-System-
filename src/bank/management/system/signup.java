package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class signup extends JFrame{
    JTextField textName ,textFName ;
    JDateChooser dateChooser;
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
        textName.setBounds(165,135,200,18);
        add(textName);


        JLabel  labelFName= new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway",Font.BOLD,15));
        labelFName.setForeground(Color.black);
        labelFName.setBounds(30,150,400,30);
        add(labelFName);
        textFName= new JTextField();
        textFName.setFont(new Font("Raleway",Font.ITALIC,14));
        textFName.setForeground(Color.black);
        textFName.setBounds(145,155,200,18);
        add(textFName);

        JLabel  labelDOB= new JLabel("Date Of Birth :");
        labelDOB.setFont(new Font("Raleway",Font.BOLD,15));
        labelDOB.setForeground(Color.black);
        labelDOB.setBounds(30,170,400,30);
        add(labelDOB);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bgimg (1).jpg"));// this will load the image from the memory to the I1.
        Image i2=i1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);// used to scale image
        ImageIcon i3 = new ImageIcon(i2);//reconvert scaled image into Image icon
        JLabel image = new JLabel(i3);// because directly we can not display image on the frame.
        image.setBounds(0,0,850,480);// it is used to alot dimensions where image will be visible.
        add(image);

        dateChooser= new JDateChooser();
        dateChooser.setForeground(Color.blue);
        dateChooser.setBounds(50,170,400, 30);


        setLayout(null);
       setSize(850,480);
       setLocation(360,40);
       setVisible(true);

    }
    public static void main(String [] args){
     new signup();
    }
}

