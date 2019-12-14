/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author marti
 */
public class LoginGUI extends JFrame{
    
private static String uName, password;
    
    JTextField username=new JTextField();
    JPasswordField pass=new  JPasswordField();
    JButton Login  = new JButton("LOGIN");
    JLabel UserNameLabel=new JLabel("Username");
    JLabel PasswordLabel=new JLabel("Password");
    JPanel jp=new JPanel();
    
    
    
     public LoginGUI() throws IOException{
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1400,750);
        setContentPane(new JLabel(new ImageIcon("D:\\Study\\Database\\Design.jpg")));
        
        UserNameLabel.setBounds(500, 300, 100, 30);
        UserNameLabel.setForeground(Color.white);
         PasswordLabel.setBounds(500, 400, 100, 30);
         PasswordLabel.setForeground(Color.white);
        username.setBounds(600, 300, 170, 30);
        pass.setBounds(600, 400, 170, 30);
        Login.setBounds(650, 450, 80, 40);
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             uName = username.getText();
        password = pass.getText();
       boolean b =new LoginFunc().checkLogin(uName,password);
       if(b== true){
           
           JoinGUI j=new JoinGUI();
           j.setVisible(true);
           dispose();
       }
       else{
           username.setText("");
       }
    }                             
 
           
        });
        add(PasswordLabel);
        add(UserNameLabel);
        add(pass);
        add(username);
        add(Login);
        validate();
}
    
}
