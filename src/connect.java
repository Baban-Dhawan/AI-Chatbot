
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class connect 
{
    Connection con;
    PreparedStatement ps;
    Statement stmt;
    ResultSet rs;
    connect()
    {
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_conn", "root","mysql");
        System.out.println("success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
}
  public static void main(String a[])
  {
      new connect();
  }
}
