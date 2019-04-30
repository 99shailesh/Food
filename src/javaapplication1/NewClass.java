/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Properties;
import org.postgresql.*;
import java.sql.*;
/**
 *
 * @author 7R-0
 */
public class NewClass {
    
    public static void main(String[] args) {
    
        // TODO code application logic here
        System.out.println("-------- PostgreSQL "
                                + "JDBC Connection Testing ------------");

                try {

                        Class.forName("org.postgresql.Driver");

                } catch (ClassNotFoundException e) {

                        System.out.println("Where is your PostgreSQL JDBC Driver? "
                                        + "Include in your library path!");
                        e.printStackTrace();
                        return;

                }

                System.out.println("PostgreSQL JDBC Driver Registered!");

                (new NewClass()).dbConnect();

    }
    
    void dbConnect(){
    PGConnection connection = null;
                
                try {
                    
                    String url = "jdbc:postgresql://127.0.0.1:60457/postgres";
                    Properties props = new Properties();
                    props.setProperty("user","postgres");
                    props.setProperty("password","123");
                    props.setProperty("ssl","true");
                    //Connection conn = DriverManager.getConnection(url, props);
                    org.postgresql.Driver d=new org.postgresql.Driver();
                    
                     System.out.println("Connecting...");
                     connection =(PGConnection)d.connect(url,props);
                     System.out.println("Registered!");
                         
                } catch (Exception e) {

                        //System.out.println("Connection Failed! Check output console");
                        e.printStackTrace();
                        return;

                }
    }
}























