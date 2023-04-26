package dbFaker.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dbFaker.dataModel.PersonModel;
import dbFaker.dataServices.DataServices;
import dbFaker.dbConnection.DMLServices;

public class ElephantMain {
	
    public static void main(String[] args) {
    	
        ArrayList<PersonModel> person = DataServices.generateData(50);        

        person.forEach(System.out::println);
             
        String url = "jdbc:postgresql://babar.db.elephantsql.com:5432/fklvqarc";
        String user = "fklvqarc";
        String password = "l_tth0QKex13IK0yoFdajK1qUwQck5h2";

      
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