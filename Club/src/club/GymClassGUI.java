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
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class GymClassGUI extends JFrame{
    JPanel jp=new JPanel();
    JLabel Classes = new JLabel("Classes");
    JTextField ClassesNameText=new JTextField();
    JTextField ClassesIDText=new JTextField();
    JTextField ClassesHoursText=new JTextField();
    JLabel ClassesNameLabel=new JLabel("Name");
    JLabel ClassesIDLabel=new JLabel("ID");
    JLabel ClassesHoursLabel=new JLabel("Hours");
    Icon AddIcon =new ImageIcon("images(2).png");
    Icon DeleteIcon =new ImageIcon("images(3).png");
    JButton Add=new JButton(AddIcon);
    JButton Delete=new JButton(DeleteIcon);
    JButton ShowAll=new JButton("Show all classes");
    Font fontLabel=new Font("TimesRoman",Font.ITALIC,25);
    Font fontText=new Font("TimesRoman",Font.ITALIC,15);
    JButton back=new JButton();
    public GymClassGUI (){
        setTitle("Gym Classes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1400,750);
        setContentPane(new JLabel(new ImageIcon("D:\\Study\\Database\\Design.jpg")));
        
        Classes.setForeground(Color.white);
        Font f=new Font("TimesRoman",Font.BOLD,60);
        Classes.setBounds(30, 40,300 , 80);
        Classes.setFont(f);
        add(Classes);
         
        
        
        
         ClassesNameLabel.setForeground(Color.white);
        ClassesNameLabel.setBounds(40, 200,100 , 30);
        ClassesNameLabel.setFont(fontLabel);
        add(ClassesNameLabel);   
         
        
        
        ClassesNameText.setBounds(40, 250,200 , 35);
        ClassesNameText.setFont(fontText);
        add(ClassesNameText);
        
        
        
        
         ClassesIDLabel.setForeground(Color.white);
        ClassesIDLabel.setBounds(40, 300,100 , 30);
        ClassesIDLabel.setFont(fontLabel);
        add(ClassesIDLabel);   
        
        
         ClassesIDText.setBounds(40, 350,200 , 35);
        ClassesIDText.setFont(fontText);
        add(ClassesIDText);
        
        
        
        
         ClassesHoursLabel.setForeground(Color.white);
        ClassesHoursLabel.setBounds(600, 200,100 , 30);
        ClassesHoursLabel.setFont(fontLabel);
        add(ClassesHoursLabel);   
        
         ClassesHoursText.setBounds(600, 250,200 , 35);
        ClassesHoursText.setFont(fontText);
        add(ClassesHoursText);
        
        
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GymClass obj=new GymClass();
                obj.addClasses(ClassesNameText.getText(),Integer.parseInt(ClassesHoursText.getText()));
                ClassesNameText.setText("");
                ClassesHoursText.setText("");
            }
        });
        Add.setBounds(860,250,30,30);
        add(Add);
        
        
         Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                GymClass obj=new GymClass();
                obj.deleteClasses(Integer.parseInt(ClassesIDText.getText()));
                ClassesIDText.setText("");
//         
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
                JFrame frame=new JFrame();
                frame.setVisible(true);
                frame. setSize(1400,750);
                GymClass obj=new GymClass();
                DefaultListModel<String>List=new DefaultListModel<>();
                JList<String>list=new JList<>(List);
                JScrollPane scroll=new JScrollPane();
                String arr[]= new  String[50];
                scroll.setBounds(200, 200, 400, 500);
                scroll.setViewportView(list);
                frame.add(scroll);
                List.addElement("Name                  ID                Hours");
                arr=obj.ShowAllClass();
                for(int i=0;i<50;i++){
                        List.addElement(arr[i]);
                } 
            }
        });
        
           add(ShowAll);
          validate();
        
           
       validate();  
          
       
       
           back.setBounds(0, 0, 30, 30);
           add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               JoinGUI j=new JoinGUI();
               j.setVisible(true);
               dispose();
            }
        });
     
                }
}