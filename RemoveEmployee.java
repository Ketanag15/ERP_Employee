package com.ems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {

    Choice cEmpId;
    JButton delete, back;

    RemoveEmployee(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        //Heading
        JLabel labelempId = new JLabel("Employee Id");
        labelempId.setBounds(50, 50, 100, 30);
        add(labelempId);

        cEmpId = new Choice();
        cEmpId.setBounds(200, 50, 150, 30);
        add(cEmpId);

        try{
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                cEmpId.add(rs.getString("EmployeeID"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        //Details Employee
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 100, 100, 30);
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200, 100, 100, 30);
        add(lblname);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 150, 100, 30);
        add(labelphone);

        JLabel lblphone = new JLabel();
        lblphone.setBounds(200, 150, 100, 30);
        add(lblphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 200, 100, 30);
        add(labelemail);

        JLabel lblemail = new JLabel();
        lblemail.setBounds(200, 200, 100, 30);
        add(lblemail);

        //Details present by Database
        try{
            Conn conn = new Conn();
            String query = "select * from employee where EmployeeID = '"+cEmpId.getSelectedItem()+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()){
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("Phone"));
                lblemail.setText(rs.getString("Email"));
            }
        } catch(Exception e){
            e.printStackTrace();
        }

        //Event to check and change the details by dropdown empID
        cEmpId.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try{
                    Conn conn = new Conn();
                    String query = "select * from employee where EmployeeID = '"+cEmpId.getSelectedItem()+"'";
                    ResultSet rs = conn.s.executeQuery(query);
                    while (rs.next()){
                        lblname.setText(rs.getString("name"));
                        lblphone.setText(rs.getString("Phone"));
                        lblemail.setText(rs.getString("Email"));
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        //buttons
        delete = new JButton("Delete");
        delete.setBounds(80, 300, 100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);

        back = new JButton("Back");
        back.setBounds(220, 300, 100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        //image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PHOTO/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 600, 400);
        add(image);

        //Frame size
        setSize(1050, 600);
        setLocation(300, 150);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == delete){
            try{
                Conn c = new Conn();
                String query = "delete from employee where EmployeeID = '"+cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Deleted Successfully");
                setVisible(false);
                new Home();

            } catch(Exception e){
                e.printStackTrace();
            }
        } else{
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
