/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author marti
 */
public class JoinGUI extends JFrame {
    
    JButton members=new JButton("Members");
    JButton coaches=new JButton("coaches");
    JButton classes=new JButton("classes");
    JButton InnerJoin=new JButton("class-member inner join");
    JButton OuterJoin=new JButton("class-member outer join");
    JButton back=new JButton();
    
    public JoinGUI(){
          setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1400,750);
        setContentPane(new JLabel(new ImageIcon("D:\\Study\\Database\\Design.jpg")));
        
        
        members.setBounds(300, 200, 150, 50);
        coaches.setBounds(600, 200, 150, 50);
        classes.setBounds(900, 200, 150, 50);
        InnerJoin.setBounds(400, 350, 200, 50);
        OuterJoin.setBounds(700, 350, 200, 50);
        add(members);
        add(coaches);
        add(classes);
        add(InnerJoin);
        add(OuterJoin);
        
        members.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  MembersGUI obj=new MembersGUI();
                  obj.setVisible(true);
                  dispose();
              }
        });
        
        
         coaches.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  CoachesGUI obj=new CoachesGUI();
                  obj.setVisible(true);
                  dispose();
              }
        });
         
         
           classes.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                  GymClassGUI obj=new GymClassGUI();
                  obj.setVisible(true);
                  dispose();
              }
        });
           
           
           
           InnerJoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame frame=new JFrame();
                frame.setVisible(true);
                frame. setSize(1400,750);
                joinClass obj=new joinClass();
                DefaultListModel<String>List=new DefaultListModel<>();
                JList<String>list=new JList<>(List);
                JScrollPane scroll=new JScrollPane();
                String arr[]= new  String[50];
                scroll.setBounds(200, 200, 400, 500);
                scroll.setViewportView(list);
                frame.add(scroll);
                List.addElement("Member Name                  Member ID                Class Name                  Class Hours");
                arr=obj.InnerJoin();
                for(int i=0;i<50;i++){
                        List.addElement(arr[i]);
                } 
                
                
            }
        });
           
           
           OuterJoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame frame=new JFrame();
                frame.setVisible(true);
                frame. setSize(1650,750);
                joinClass obj=new joinClass();
                DefaultListModel<String>List=new DefaultListModel<>();
                JList<String>list=new JList<>(List);
                JScrollPane scroll=new JScrollPane();
                String arr[]= new  String[50];
                scroll.setBounds(200, 200, 400, 500);
                scroll.setViewportView(list);
                frame.add(scroll);
                List.addElement("Member Name                  Member ID                Class Name                  Class Hours");
                arr=obj.OuterJoin();
                for(int i=0;i<50;i++){
                        List.addElement(arr[i]);
                } 
                
                
            }
        });
       
            back.setBounds(0, 0, 30, 30);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    LoginGUI j=new LoginGUI(); 
                    j.setVisible(true);
                    dispose();
                } catch (IOException ex) {
                    Logger.getLogger(JoinGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
    
    }
      
}
