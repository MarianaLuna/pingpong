/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maria
 */
public class SingleConnection {
    private static Connection con = null;
    private String driver;
    private String url;
    private String user;
    private String password;
    
    private SingleConnection(){
        String url = "jdbc:mysql://localhost:3306/pingpong";
        String driver = "com.mysql.jdbc.Driver";
        String user ="root";
        String password = "123456789";
        
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public static Connection getInstance(){
        
        if(con == null){
            new SingleConnection();
            System.out.print("Conectado");
        }
        return con;
    }
    
    public static void desconectar(){
        try{
            con.close();
        }catch(SQLException ex){
            System.out.print(ex);
        }
    }
    
}
