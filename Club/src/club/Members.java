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
public class Members {
    String m_name ;
    int m_id ;
    int class_id ;
    int m_phone ;
    int date ;
    
    
    public Members() {
    }

    public void addMembers( String m_name , int m_id , int class_id , int m_phone , int date)
    {
           try { 
            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO members " + 
                "VALUES (" + m_name + "," + m_id + "," + class_id + "," + m_phone + "," + date + ")") ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
        public void deleteMembers(int m_id)
    {
           try { 
            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("DELETE FROM members " + 
                "WHERE m_id = " + m_id) ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    
    
    
}
