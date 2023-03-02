package dbFaker.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbFaker.dataModel.PersonModel;
import dbFaker.dataServices.DataServices;
import dbFaker.dbConnection.DMLServices;

public class Main {
	
    public static void main(String[] args) {
    	
        ArrayList<PersonModel> person = DataServices.generateData(50000);        

        person.forEach(System.out::println);
             
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "thiago";
        
        try {
            
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");
            
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