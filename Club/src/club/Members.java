/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Ahmed Kamal
 */
public class Members {
    String m_name ;
    int m_id ;
    int class_id ;
    int m_phone ;
    
    
    public Members() {
    }

    public Members(String m_name, int m_id, int class_id, int m_phone) {
        this.m_name = m_name;
        this.m_id = m_id;
        this.class_id = class_id;
        this.m_phone = m_phone;
    }
    

    public void addMembers( String m_name , int class_id , int m_phone)
    {
           try { 
             Connection conn = new ConnectionFunction().connect();
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO members " + 
                "VALUES (" + "'" + m_name + "'" + "," + class_id + "," + m_phone + ")") ;
            //I REMOVED THE ID FROM HERE AS I MADE IT AN IDENTITY IN THE DATABASE
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
        public void deleteMembers(int m_id)
    {
           try { 
            Connection conn = new ConnectionFunction().connect();
            Statement st = conn.createStatement(); 
            st.executeUpdate("DELETE FROM members " + 
                "WHERE m_id = " + m_id) ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
        
        
                public String[] ShowAllMembers(){
                    String arr[]=new String[5];
                    try {
                   Connection conn = new ConnectionFunction().connect();
                   Statement st = conn.createStatement();
                   ResultSet rs= st.executeQuery("SELECT * FROM members");
                  int i=0;
                   while(rs.next()){
                       arr[i]=rs.getString(1)+"                "+Integer.toString(rs.getInt(2))+"                "+Integer.toString(rs.getInt(3))+"                "+Integer.toString(rs.getInt(4));
                       i++;
                   }  
          conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }    
                    return arr;
                }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getM_phone() {
        return m_phone;
    }

    public void setM_phone(int m_phone) {
        this.m_phone = m_phone;
    }
}






//                public ArrayList<Members> ShowAllMembers()
//    {
//        
//               ArrayList<Members> membersList = new ArrayList<>();
//               
//               try {
//                   Connection conn = new ConnectionFunction().connect();
//                   Statement st = conn.createStatement();
//                   ResultSet rs= st.executeQuery("SELECT * FROM members");
//                   Members member ;
//                   while(rs.next()){
//                       member=new Members(rs.getString(1),rs.getInt(2)
//                               ,rs.getInt(3),rs.getInt(4));
//                       membersList.add(member);
//                   }  
//          conn.close(); 
//        } catch (Exception e) { 
//            System.err.println("Got an exception! "); 
//            System.err.println(e.getMessage()); 
//        }    
//               return membersList;
//    }