/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author 7R-0
 */
public class Common {
    public static String hotelid;
    public static String hotelname;
    public static String customername;
    public static String customerphone;
   /* 
    public static Connection getdbconnect(){
     Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:50109/postgres",
            "postgres", "postgres");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
         return c;
      }
      System.out.println("Opened database successfully");
      return c;
    }*/
    
        public static Connection getdbconnect(){
     Connection c = null;
      try {
         Class.forName("com.mysql.jdbc.Driver");
       //  System.out.println("Driver Register");
         c = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/fooddb",
            "root", "");
       //  System.out.println("Connection done");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
         return c;
      }
      //System.out.println("Opened database successfully");
      return c;
    }
        
        public static void setTable(JTable jt,ResultSet rs){
    

        try
        {
  
        jt.setModel(DbUtils.resultSetToTableModel(rs));
      
        }
        catch(Exception e)
        { 
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
        }
        }
}












