package dbFaker.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import dbFaker.dataModel.PersonModel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DMLServices {
	
	public static void insert(Connection conn, ArrayList<PersonModel> data) throws SQLException {
		for(int i = 0; i<data.size();i++) {
        	PreparedStatement ps = conn.prepareStatement(
         		   "INSERT INTO client (name, city, job, university)\r\n"+
         	       "values ('"+data.get(i).getName()+"',"
         	  			+ " '"+data.get(i).getCity()+"',"
         	  			+ " '"+data.get(i).getJob() +"',"
         	  			+ " '"+data.get(i).getUniversity()+"')"
         			);
                        
         ps.executeUpdate();
        	
        }
	}

}
