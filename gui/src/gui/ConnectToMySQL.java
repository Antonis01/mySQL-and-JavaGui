/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.sql.*;

/**
 *
 * @author antonis
 */
public class ConnectToMySQL {
    
    private static final String DB_URL = ("jdbc:mysql://localhost:3306/travel_agency");
    
    public static String getDB_URL(){
        return DB_URL;
    }
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(DB_URL,"root","1234");
        }catch(SQLException ex){
            return (Connection) ex;
        }
    }
}