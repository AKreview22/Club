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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
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
public class CoachesGUI extends JFrame{
    JPanel jp=new JPanel();
    JLabel Coaches = new JLabel("Coaches");
    JTextField CoachNameText=new JTextField();
    JTextField CoachIDText=new JTextField();
    JTextField CoachClassText=new JTextField();
    JTextField CoachPhoneText=new JTextField();
    JTextField CoachSalaryText=new JTextField();
    JLabel CoachNameLabel=new JLabel("Name");
    JLabel CoachIDLabel=new JLabel("ID");
    JLabel CoachClasseLabel=new JLabel("Class");
    JLabel CoachPhoneLabel=new JLabel("Phone Number");
     JLabel CoachSalaryLabel=new JLabel("Salary");
    Icon AddIcon =new ImageIcon("images(2).png");
    Icon DeleteIcon =new ImageIcon("images(3).png");
    JButton Add=new JButton(AddIcon);
    JButton Delete=new JButton(DeleteIcon);
    JButton ShowAll=new JButton("Show all Coaches");
    Font fontLabel=new Font("TimesRoman",Font.ITALIC,25);
    Font fontText=new Font("TimesRoman",Font.ITALIC,15);
    public CoachesGUI (){
        setTitle("Coaches");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1650,750);
        setContentPane(new JLabel(new ImageIcon("D:\\Study\\Database\\Design.jpg")));
        
        Coaches.setForeground(Color.white);
        Font f=new Font("TimesRoman",Font.BOLD,60);
        Coaches.setBounds(30, 40,300 , 80);
        Coaches.setFont(f);
        add(Coaches);
         
        
        
         CoachNameLabel.setForeground(Color.white);
        CoachNameLabel.setBounds(40, 200,100 , 30);
        CoachNameLabel.setFont(fontLabel);
        add(CoachNameLabel);   
         
        
        
        CoachNameText.setBounds(40, 250,200 , 35);
        CoachNameText.setFont(fontText);
        add(CoachNameText);
        
        
        
        
         CoachIDLabel.setForeground(Color.white);
        CoachIDLabel.setBounds(40, 300,100 , 30);
        CoachIDLabel.setFont(fontLabel);
        add(CoachIDLabel);   
        
        
         CoachIDText.setBounds(40, 350,200 , 35);
        CoachIDText.setFont(fontText);
        add(CoachIDText);
        
        
         CoachPhoneLabel.setForeground(Color.white);
        CoachPhoneLabel.setBounds(330, 200,200 , 30);
        CoachPhoneLabel.setFont(fontLabel);
        add(CoachPhoneLabel);  
        
        
         CoachPhoneText.setBounds(330, 250,200 , 35);
        CoachPhoneText.setFont(fontText);
        add(CoachPhoneText);
        
        
         CoachClasseLabel.setForeground(Color.white);
        CoachClasseLabel.setBounds(600, 200,100 , 30);
        CoachClasseLabel.setFont(fontLabel);
        add(CoachClasseLabel);   
        
         CoachClassText.setBounds(600, 250,200 , 35);
        CoachClassText.setFont(fontText);
        add(CoachClassText);
        
         CoachSalaryLabel.setForeground(Color.white);
        CoachSalaryLabel.setBounds(860, 200,100 , 30);
        CoachSalaryLabel.setFont(fontLabel);
        add(CoachSalaryLabel);   
        
         CoachSalaryText.setBounds(860, 250,200 , 35);
        CoachSalaryText.setFont(fontText);
        add(CoachSalaryText);
        
        
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                coaches obj=new coaches();
                obj.addCoaches(CoachNameText.getText(),
                        Integer.parseInt(CoachClassText.getText()),
                        Integer.parseInt(CoachPhoneText.getText()),Integer.parseInt(CoachSalaryText.getText()));
            }
       });
        Add.setBounds(1100,250,30,30);
        add(Add);
//        
        
         Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                coaches obj=new coaches();
                obj.deleteCoaches(Integer.parseInt(CoachIDText.getText()));
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
                
                JTable j=new JTable();
                DefaultTableModel model= (DefaultTableModel)j.getModel();
                ArrayList<coaches>list=new ArrayList<>();
                JScrollPane js=new JScrollPane();
                js.setBounds(200, 200, 400, 500);
                js.setViewportView(j);
                add(js);
                j=new JTable(model);
                
                
                
                Object[]row=new Object[5];
                for(int i=0;i<list.size();i++){
                    row[0]=list.get(i).getC_name();
                    row[1]=list.get(i).getC_id();
                    row[2]=list.get(i).getClass_id();
                    row[3]=list.get(i).getC_phone();
                    row[4]=list.get(i).getC_salary();
                    model.addRow(row);
                }
            }
        });
        
           add(ShowAll);
          validate();
        
           
       validate();  
          
     
                }
}