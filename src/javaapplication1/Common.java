/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author 7R-0
 */
public class Common {
    public static String hotelid;
    public static String hotelname;
    public static String customerid;
    
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
    }
    
    
}





