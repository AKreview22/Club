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
public class GymClass {
    //TEST
    String class_name ;
    int class_id ;
    int class_hours ;
    
    
    public GymClass() {
    }

    public void addClasses( String class_name , int class_id , int class_hours)
    {
           try { 
            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO class " + 
                "VALUES (" + class_name + "," + class_id + "," + class_id + "," + class_hours + ")") ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
        public void deleteClasses(int class_id)
    {
           try { 
            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("DELETE FROM class " + 
                "WHERE class_id = " + class_id) ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
        
                public void ShowAllClasses()
    {
           try { 
            String url = "jdbc:msql://200.210.220.1:1114/Demo"; 
            Connection conn = DriverManager.getConnection(url,"",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("SELECT * from class ;") ;  
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getClass_hours() {
        return class_hours;
    }

    public void setClass_hours(int class_hours) {
        this.class_hours = class_hours;
    }

  
   
}
