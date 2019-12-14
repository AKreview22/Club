/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.sql.*;

/**
 *
 * @author Ahmed Kamal
 */
public class joinClass {

    public joinClass() {
    }
    
     public String[] InnerJoin(){
                    String arr[]=new String[200];
                    try {
                   Connection conn = new ConnectionFunction().connect();
                   Statement st = conn.createStatement();
                   ResultSet rs= st.executeQuery("SELECT m_name , m_id , class_name , class_hours \n" +
                        "FROM [members] JOIN class\n" +
                         "ON [members].class_id=class.class_id");
                   
                  int i=0;
                   while(rs.next()){
                       arr[i]=rs.getString(1)+"                    "+Integer.toString(rs.getInt(2))+"                    "+rs.getString(3)+"                    "+Integer.toString(rs.getInt(4));

                       i++;
                   }  
          conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }    
                    return arr;
                }
     
     public String[] OuterJoin(){
                    String arr[]=new String[200];
                    try {
                   Connection conn = new ConnectionFunction().connect();
                   Statement st = conn.createStatement();
                   ResultSet rs= st.executeQuery("SELECT m_name , m_id , class_name , class_hours \n" +
                        "FROM [members] FULL OUTER JOIN class\n" +
                        "ON [members].class_id=class.class_id");
                   
                  int i=0;
                   while(rs.next()){
                       arr[i]=rs.getString(1)+"                "+Integer.toString(rs.getInt(2))+"                "+rs.getString(3)+"                "+Integer.toString(rs.getInt(4));

                       i++;
                   }  
          conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }    
                    return arr;
                }
    
}
