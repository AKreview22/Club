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
public class Login1 extends JFrame{
    
    JTextField username=new JTextField();
    JTextField password=new  JTextField();
    JButton Login  = new JButton("LOGIN");
    JLabel UserNameLabel=new JLabel("Username");
    JLabel PasswordLabel=new JLabel("Password");
    JPanel jp=new JPanel();
    
    
    public Login1(){
    
     setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1650,750);
        setContentPane(new JLabel(new ImageIcon("IMG-20191201-WA0008.png")));
        
      
        
        UserNameLabel.setForeground(Color.orange);
        PasswordLabel.setForeground(Color.orange);
        UserNameLabel.setBounds(500, 300, 100, 30);
        PasswordLabel.setBounds(500, 400, 100, 30);
        username.setBounds(600, 300, 170, 30);
        password.setBounds(600, 400, 170, 30);
        Login.setBounds(650, 450, 80, 40);
        add(PasswordLabel);
        add(UserNameLabel);
        add(password);
        add(username);
        add(Login);
        
        Login.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) {
               try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=gymdb";
           try (Connection con = DriverManager.getConnection(url)) {
               String sql = "Select * from test where username=? and password = ?";
               PreparedStatement pst = con.prepareStatement(sql);
               pst.setString(1, username.getText());
               pst.setString(2, password.getText());
               ResultSet rs = pst.executeQuery();
               if(rs.next()){
                   JOptionPane.showMessageDialog(null, "Username and Password Matched");
               }
               else{
                   JOptionPane.showMessageDialog(null, "Username and password not Correct");
                   username.setText("");
                   password.setText("");
               }
           }
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
                              
             
            }
        });
        

    
    }
    
    
    
      validate();
    
    
}
