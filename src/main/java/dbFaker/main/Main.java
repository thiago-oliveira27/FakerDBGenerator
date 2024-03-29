package dbFaker.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbFaker.dataModel.PersonModel;
import dbFaker.dataServices.DataServices;
import dbFaker.dbConnection.DMLServices;
import io.github.cdimascio.dotenv.Dotenv;


public class Main {
	
    public static void main(String[] args) {
    	
        Dotenv dotenv = Dotenv.load();
        

        ArrayList<PersonModel> person = DataServices.generateData(50);        

        person.forEach(System.out::println);
            
        
        String dbHost = dotenv.get("DB_HOST");
        String dbUsername = dotenv.get("DB_USERNAME");
        String dbPassword = dotenv.get("DB_PASSWORD");
        
        try {
            
            Connection conn = DriverManager.getConnection(dbHost, dbUsername, dbPassword);
            System.out.println("Conex�o bem-sucedida!");
            
            // SQL
            
            Statement st = conn.createStatement();
                      
            DMLServices.insert(conn, person);
            
            st.close();              
            conn.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
     System.out.println("Finalizado");   
     System.exit(0);  
     
  
    }
}