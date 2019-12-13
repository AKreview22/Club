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
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
        MemberIDLabel.setBounds(40, 300,100 , 30);
        MemberIDLabel.setFont(fontLabel);
        add(MemberIDLabel);   
        
        
         MemberIDText.setBounds(40, 350,200 , 35);
        MemberIDText.setFont(fontText);
        add(MemberIDText);
        
        
         MemberPhoneLabel.setForeground(Color.white);
        MemberPhoneLabel.setBounds(330, 200,200 , 30);
        MemberPhoneLabel.setFont(fontLabel);
        add(MemberPhoneLabel);  
        
        
         MemberPhoneText.setBounds(330, 250,200 , 35);
        MemberPhoneText.setFont(fontText);
        add(MemberPhoneText);
        
        
         MemberClasseLabel.setForeground(Color.white);
        MemberClasseLabel.setBounds(600, 200,100 , 30);
        MemberClasseLabel.setFont(fontLabel);
        add(MemberClasseLabel);   
        
         MemberClassText.setBounds(600, 250,200 , 35);
        MemberClassText.setFont(fontText);
        add(MemberClassText);
        
        
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Members obj=new Members();
                obj.addMembers(MemberNameText.getText(),Integer.parseInt(MemberClassText.getText()),Integer.parseInt(MemberPhoneText.getText()));
            }
        });
        Add.setBounds(860,250,30,30);
        add(Add);
        
        
         Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Members obj=new Members();
                 obj.deleteMembers(Integer.parseInt(MemberIDText.getText()));
            }
        });
        Delete.setBounds(300,350,30,30);
        add(Delete);
        
        
        
        ShowAll.setBounds(40,450, 200, 40);
        Font fontButton=new Font("TimesRoman",Font.BOLD,15);
        ShowAll.setFont(fontButton);
        ShowAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Members obj=new Members();
                obj.ShowAllMembers();
                JTable j=new JTable();
                DefaultTableModel model= (DefaultTableModel)j.getModel();
                ArrayList<Members>list=new ArrayList<>();
                JScrollPane js=new JScrollPane();
                js.setBounds(200, 200, 400, 500);
                js.setViewportView(j);
                add(js);
                j=new JTable(model);
                
                
                
                Object[]row=new Object[4];
                for(int i=0;i<list.size();i++){
                    row[0]=list.get(i).getM_name();
                    row[1]=list.get(i).getM_id();
                    row[2]=list.get(i).getClass_id();
                    row[3]=list.get(i).getM_phone();
                    model.addRow(row);
                }
        
            }
        });
       
           add(ShowAll);
          validate();
          
    }
        }