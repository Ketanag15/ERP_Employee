package com.ems;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener {

   // String id = getAlphaNumericString();
    JTextField tfeducation, tffname, tfsalary,  tfaddress, tfdesignation, tfphone, tfaadhar, tfemail;
    JLabel lblempID;
    JButton add, back;
    String EmployeeID;
    UpdateEmployee(String EmployeeID){

        this.EmployeeID = EmployeeID;
        getContentPane().setBackground(Color.gray);
        setLayout(null);

        //Heading
        JLabel heading = new JLabel("Update Details of Employee");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);

        //name
        JLabel labelname = new JLabel("Employee Name");
        labelname.setBounds(30, 150, 150, 30);;
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.WHITE);
        add(labelname);

        JLabel lblname = new JLabel();
        lblname.setBounds(200,150, 150, 30);
        add(lblname);

        //Father name
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);;
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        labelfname.setForeground(Color.WHITE);
        add(labelfname);

        tffname = new JTextField();
        tffname.setBounds(600,150, 150, 30);
        add(tffname);

        //DOB
        JLabel labeldob = new JLabel("Date Of Birth");
        labeldob.setBounds(50, 200, 150, 30);;
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        labeldob.setForeground(Color.WHITE);
        add(labeldob);

        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);

        //Salary
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);;
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        labelsalary.setForeground(Color.WHITE);
        add(labelsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        //Address
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);;
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        labeladdress.setForeground(Color.WHITE);
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        //Phone
        JLabel labelphone= new JLabel("Phone Number");
        labelphone.setBounds(400, 250, 150, 30);;
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        labelphone.setForeground(Color.WHITE);
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        //Email
        JLabel labelemail = new JLabel("Email Address");
        labelemail.setBounds(50, 300, 150, 30);;
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        labelemail.setForeground(Color.WHITE);
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        //Education
        JLabel labelEducation = new JLabel("Highest Education");
        labelEducation.setBounds(400, 300, 150, 30);;
        labelEducation.setFont(new Font("serif", Font.PLAIN, 20));
        labelEducation.setForeground(Color.WHITE);
        add(labelEducation);

        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);

        //Designation
        JLabel labelDesignation = new JLabel("Designation");
        labelDesignation.setBounds(50, 350, 150, 30);;
        labelDesignation.setFont(new Font("serif", Font.PLAIN, 20));
        labelDesignation.setForeground(Color.WHITE);
        add(labelDesignation);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        //Adhaar Number
        JLabel labelAdhaar= new JLabel("Aadhar Number");
        labelAdhaar.setBounds(400, 350, 150, 30);;
        labelAdhaar.setFont(new Font("serif", Font.PLAIN, 20));
        labelAdhaar.setForeground(Color.WHITE);
        add(labelAdhaar);

        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        add(lblaadhar);

        //EMP ID
        JLabel labelemp = new JLabel("Employee ID");
        labelemp.setBounds(50, 400, 150, 30);;
        labelemp.setFont(new Font("serif", Font.PLAIN, 20));
        labelemp.setForeground(Color.WHITE);
        add(labelemp);

        lblempID= new JLabel();
        lblempID.setBounds(200, 400, 150, 30);;
        lblempID.setFont(new Font("serif", Font.PLAIN, 20));
        lblempID.setForeground(Color.WHITE);
        add(lblempID);

        //MySQL info
        try{
            Conn conn = new Conn();
            String query = "select * from employee where EmployeeID = '"+EmployeeID+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while (rs.next()){
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("Address"));
                tfsalary.setText(rs.getString("Salary"));
                tfphone.setText(rs.getString("Phone"));
                tfemail.setText(rs.getString("Email"));
                tfeducation.setText(rs.getString("Education"));
                lblaadhar.setText(rs.getString("AadharNo"));
                tfdesignation.setText(rs.getString("Designation"));
                lblempID.setText(rs.getString("EmployeeID"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        //Buttons
        add = new JButton("Update Details");
        add.setBounds(250, 550, 150, 30);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(450, 550, 150, 30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        //frame size
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) tfeducation.getText();
            String designation = tfdesignation.getText();

            try {
                Conn conn = new Conn();
                String query = "update employee set fname = '"+fname+"', salary = '"+salary+"', address = '"+address+"', " +
                        "phone = '"+phone+"', email =  '"+email+"'" + ", education = '"+education+"', " +
                        "designation = '"+designation+"' where EmployeeID = '"+EmployeeID+"'";

                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Updated Successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else{
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}
