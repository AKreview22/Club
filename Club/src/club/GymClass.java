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
public class GymClass {
    //TEST
    String class_name ;
    int class_id ;
    int class_hours ;
    
    
    public GymClass() {
    }

    public GymClass(String class_name, int class_id, int class_hours) {
        this.class_name = class_name;
        this.class_id = class_id;
        this.class_hours = class_hours;
    }
    
    

    public void addClasses( String class_name , int class_hours)
    {
           try { 
             Connection conn = new ConnectionFunction().connect();
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO class " + 
                "VALUES (" + "'" + class_name + "'" + "," + class_hours + ")") ;
            //I REMOVED THE ID FROM HERE AS I MADE IT AN IDENTITY IN THE DATABASE
            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }
    
        public void deleteClasses(int class_id)
    {
           try { 
            Connection conn = new ConnectionFunction().connect();
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

               ArrayList<GymClass> classList = new ArrayList<>();
               
               try {
                   Connection conn = new ConnectionFunction().connect();
                   Statement st = conn.createStatement();
                   ResultSet rs= st.executeQuery("SELECT * FROM coaches");
                   GymClass classes ;
                   while(rs.next()){
                       classes=new GymClass(rs.getString(1),rs.getInt(2)
                               ,rs.getInt(3));
                       classList.add(classes);
                   }  
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
