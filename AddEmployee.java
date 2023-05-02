package com.ems;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {

   String id = getAlphaNumericString();
   JTextField tfname, tffname, tfsalary,  tfaddress, tfdesignation, tfphone, tfaadhar, tfemail;
   JDateChooser dcdob;
   JComboBox cbEducation;
   JLabel lblempID;
   JButton add, back;
   static String getAlphaNumericString()
    {

        // choose a Character random from this String
        String AlphaNumericString = "EMPLOYANGTS"
                + "0123456789" ;

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    AddEmployee(){

        getContentPane().setBackground(Color.gray);
        setLayout(null);

        //Heading
        JLabel heading = new JLabel("Add Details of Employee");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        add(heading);

        //name
        JLabel labelname = new JLabel("Employee Name");
        labelname.setBounds(30, 150, 150, 30);;
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.WHITE);
        add(labelname);

        tfname = new JTextField();
        tfname.setBounds(200,150, 150, 30);
        add(tfname);

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

        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);

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

        String courses[] = {"Senior Secondary", "Graduation", "Post Grad", "PhD",};
        cbEducation = new JComboBox(courses);
        cbEducation.setBounds(600, 300, 150, 30);
        add(cbEducation);

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

        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);

        //EMP ID
        JLabel labelemp = new JLabel("Employee ID");
        labelemp.setBounds(50, 400, 150, 30);;
        labelemp.setFont(new Font("serif", Font.PLAIN, 20));
        labelemp.setForeground(Color.WHITE);
        add(labelemp);

        lblempID= new JLabel(id);
        lblempID.setBounds(200, 400, 150, 30);;
        lblempID.setFont(new Font("serif", Font.PLAIN, 20));
        lblempID.setForeground(Color.WHITE);
        add(lblempID);

        //Buttons
        add = new JButton("Add Details");
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent() ).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbEducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String EmployeeID = lblempID.getText();

            try {
                Conn conn = new Conn();
                String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary + "', " +
                        "'" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation + "', '" + aadhar + "', '" + EmployeeID + "')";

                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Added Successfully");
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
        new AddEmployee();
    }
}