package com.ems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JButton add, view, update, remove;
    public Home(){

        setLayout(null);

        //Image code
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PHOTO/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); //first image name = image
        image.setBounds(0, 0, 1120, 630);
        add(image);

        //Heading code
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(640, 29, 400, 60);
        heading.setFont(new Font("Raleway", Font.BOLD, 26));
        image.add(heading);

        //add Button
        add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);

        //view Button
        view = new JButton("View Employees");
        view.setBounds(850, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);

        //update Button
        update = new JButton("Update Details");
        update.setBounds(650, 150, 150, 40);
        update.addActionListener(this);
        image.add(update);

        //remove Button
        remove = new JButton("Remove Employee");
        remove.setBounds(850, 150, 150, 40);
        remove.addActionListener(this);
        image.add(remove);

        //Frame code
        setSize(1120, 630);
        setLocation(400, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == add){
            setVisible(false);
            new AddEmployee();
        } else if(ae.getSource() == view){
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update){
            setVisible(false);
            new ViewEmployee();
        } else{
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
