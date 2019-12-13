/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed Kamal
 */
public class ConnectionFunction {
    private Connection DBConnection;
    public Connection connect(){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connection Success(1)");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"error check mysql driver for java : "+ex );
            System.exit(0);
            
        }
        
        String url = "jdbc:sqlserver://localhost:1433;databaseName=gymdb;";
        String name = "AK";
        String password = "12345";
        
        try{
            DBConnection = (Connection) DriverManager.getConnection(url, name, password);
            System.out.println("Database Connected(2)");
            
        }
        catch(SQLException se){
            System.out.println("Database application is not running or incorrect url/name/password for the database :"+se);
            JOptionPane.showMessageDialog(null,"base application is not running or incorrect url/name/password for the database : "+se );
            System.exit(0);
        }
        return DBConnection;
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
