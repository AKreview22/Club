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
public class coaches {
    String c_name ;
    int c_id ;
    int class_id ;
    int c_phone ;
    int c_salary ;
    
    
    public coaches() {
    }

    public void addCoaches( String c_name , int class_id , int c_phone , int c_salary )
    {
           try { 
            String url="jdbc:sqlserver://localhost:1433;databaseName=gymdb";
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO coaches " + 
                "VALUES (" + c_name + "," + class_id + "," + c_phone + "," + c_salary + ")") ;
            //I REMOVED THE ID FROM HERE AS I MADE IT AN IDENTITY IN THE DATABASE
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
        public void deleteCoaches(int c_id)
    {
           try { 
            String url="jdbc:sqlserver://localhost:1433;databaseName=gymdb";
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("DELETE FROM coaches " + 
                "WHERE c_id = " + c_id) ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
        
                public void ShowAllCoaches()
    {
           try { 
            String url="jdbc:sqlserver://localhost:1433;databaseName=gymdb"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("SELECT * from coaches ;") ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getC_phone() {
        return c_phone;
    }

    public void setC_phone(int c_phone) {
        this.c_phone = c_phone;
    }


   
}