package com.ems;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField text_user, text_pass;
    Login(){

        //Frame color and size
        getContentPane().setBackground(Color.white);
        setLayout(null);

        //Text Fields, username and password
        JLabel lblname = new JLabel("Username");
        lblname.setBounds(50, 25, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        text_user = new JTextField();
        text_user.setBounds(200, 25, 250, 30);
        add(text_user);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50, 80, 100, 30);
        lblpassword.setFont(new Font("serif", Font.BOLD, 20));
        add(lblpassword);

        text_pass = new JTextField();
        text_pass.setBounds(200, 80, 250, 30);
        add(text_pass);

        //second Page Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PHOTO/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //first image name = image
        image.setBounds(45, 80, 550, 400);
        add(image);

        //Login Button
        JButton login = new JButton("Login");
        login.setBounds(200, 150, 250, 30);
        login.setBackground(new Color(0,0,0));
        login.setForeground(new Color(255,255,255));
        login.setFont(new Font("serif", Font.PLAIN, 25));
        login.addActionListener(this);
        add(login);

        //for frame size and visiblity
        setSize(600, 400);
        setLocation(650, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            String username = text_user.getText();
            String password = text_pass.getText();

            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";

            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()){
                setVisible(false);
                // next frame
                new Home();
            } else{
                JOptionPane.showMessageDialog(null, "Invalid Credentials");
                setVisible(true);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
