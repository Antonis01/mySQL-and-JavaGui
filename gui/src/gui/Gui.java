package gui;

import java.sql.*;

public class Gui extends LoginFrame{

    public static final String DB_URL = ("jdbc:mysql://localhost:3306/travel_agency");
  
    public static void main(String[] args) {
        

        try{
            
            LoginFrame.getLoginFrame(true);
            
        
            }catch (RuntimeException ex){
                    ex.printStackTrace();
            }
    }   
}
