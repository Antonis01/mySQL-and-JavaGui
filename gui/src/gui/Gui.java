package gui;

import java.sql.*;


public class Gui {

    private static final String DB_URL = ("jdbc:mysql://localhost:3306/travel_agency");
  
    public static void main(String[] args) {
       
        try{
                
                // Connect to database
                Connection con = DriverManager.getConnection(DB_URL,"root","1234");
                
                // Initialize a statement object for executing queries to database
                Statement stmt = con.createStatement();
                
                // Execute query and get results
                ResultSet resultSet = stmt.executeQuery("SELECT * FROM worker");
                
                // Process and print results
                ResultSetMetaData metaData = resultSet.getMetaData();
                int numberOfColumns = metaData.getColumnCount();
                
                // Print column names
                for(int i=1; i<=numberOfColumns;i++)
                    System.out.printf("%-8s\t", metaData.getColumnName(i));
                System.out.println();
                
                // Move the cursor to the next row of the results and print the value of each column 
                while(resultSet.next()){
                    for(int i=1; i<=numberOfColumns;i++)                    
                        System.out.printf("%-8s\t", resultSet.getObject(i));
                    System.out.println();
                }
                
            }catch (SQLException ex){
                    ex.printStackTrace();
            }
    }   
}