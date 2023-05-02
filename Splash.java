package com.ems;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {
    Splash(){

        //Frame color and size
        getContentPane().setBackground(Color.white);
        setLayout(null);

        //Heading
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(45, 15, 1500, 60);
        heading.setFont(new Font("serif", Font.BOLD, 60));
        heading.setForeground(new Color(120,120,190));
        add(heading);

        //Front Page Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PHOTO/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //first image name = image
        image.setBounds(45, 80, 1050, 500);
        add(image);

        //continue button
        JButton clickhere = new JButton("Click here to Continue");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(new Color(0,0,0));
        clickhere.setForeground(new Color(255,255,255));
        clickhere.setFont(new Font("serif", Font.BOLD, 25));
        clickhere.addActionListener(this);
        image.add(clickhere);

        //for frame size and visiblity
        setSize(1170, 650);
        setLocation(100, 50);
        setVisible(true);

        //for dipping the heading
        while(true) {
            clickhere.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
            clickhere.setVisible(true);
            try{
                Thread.sleep(500);
            }catch(Exception e){

            }
        }
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();

    }
}
