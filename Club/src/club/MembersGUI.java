/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marti
 */
public class MembersGUI extends JFrame{
    
        JPanel jp=new JPanel();
    JLabel Members = new JLabel("Members");
    JTextField MemberNameText=new JTextField();
    JTextField MemberIDText=new JTextField();
    JTextField MemberClassText=new JTextField();
    JTextField MemberPhoneText=new JTextField();
    JLabel MemberNameLabel=new JLabel("Name");
    JLabel MemberIDLabel=new JLabel("ID");
    JLabel MemberClasseLabel=new JLabel("Class");
    JLabel MemberPhoneLabel=new JLabel("Phone Number");
    Icon AddIcon =new ImageIcon("D:\\Study\\Database\\add.png");
    Icon DeleteIcon =new ImageIcon("D:\\Study\\Database\\delete.jpg");
    JButton Add=new JButton(AddIcon);
    JButton Delete=new JButton(DeleteIcon);
    JButton ShowAll=new JButton("Show all members");
    Font fontLabel=new Font("TimesRoman",Font.ITALIC,25);
    Font fontText=new Font("TimesRoman",Font.ITALIC,15);
    public MembersGUI (){
        setTitle("Members");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1650,750);
        setContentPane(new JLabel(new ImageIcon("D:\\Study\\Database\\Design.jpg")));
        
        Members.setForeground(Color.white);
        Font f=new Font("TimesRoman",Font.BOLD,60);
        Members.setBounds(30, 40,300 , 80);
        Members.setFont(f);
        add(Members);
         
        
        
         MemberNameLabel.setForeground(Color.white);
        MemberNameLabel.setBounds(40, 200,100 , 30);
        MemberNameLabel.setFont(fontLabel);
        add(MemberNameLabel);   
         
        
        
        MemberNameText.setBounds(40, 250,200 , 35);
        MemberNameText.setFont(fontText);
        add(MemberNameText);
        
        
        
        
         MemberIDLabel.setForeground(Color.white);
        MemberIDLabel.setBounds(350, 200,100 , 30);
        MemberIDLabel.setFont(fontLabel);
        add(MemberIDLabel);   
        
        
         MemberIDText.setBounds(350, 250,200 , 35);
        MemberIDText.setFont(fontText);
        add(MemberIDText);
        
        
         MemberPhoneLabel.setForeground(Color.white);
        MemberPhoneLabel.setBounds(650, 200,200 , 30);
        MemberPhoneLabel.setFont(fontLabel);
        add(MemberPhoneLabel);  
        
        
         MemberPhoneText.setBounds(650, 250,200 , 35);
        MemberPhoneText.setFont(fontText);
        add(MemberPhoneText);
        
        
         MemberClasseLabel.setForeground(Color.white);
        MemberClasseLabel.setBounds(950, 200,100 , 30);
        MemberClasseLabel.setFont(fontLabel);
        add(MemberClasseLabel);   
        
         MemberClassText.setBounds(950, 250,200 , 35);
        MemberClassText.setFont(fontText);
        add(MemberClassText);
        
        
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Members obj=new Members();
                obj.addMembers(MemberNameText.getText(),Integer.parseInt(MemberClassText.getText()),Integer.parseInt(MemberPhoneText.getText()));
            }
        });
        Add.setBounds(1200,250,30,30);
        add(Add);
        
        
         Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Members obj=new Members();
                obj.addMembers(MemberNameText.getText(),Integer.parseInt(MemberClassText.getText()),Integer.parseInt(MemberPhoneText.getText()));
            }
        });
        Delete.setBounds(1250,250,30,30);
        add(Delete);
        
        
        
           
       validate();  
          
     
                }
        }
