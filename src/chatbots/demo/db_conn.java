
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbots.demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author User
 */
public class db_conn
{
    Connection con;
    Statement stmt;
    PreparedStatement ps;
    ResultSet res;
    
    db_conn(){
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_conn","root","mysql");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
}
    public static void main(String a[])
    {
        new db_conn();
    }
            
    
}
