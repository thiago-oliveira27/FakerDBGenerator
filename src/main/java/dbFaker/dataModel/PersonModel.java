package dbFaker.dataModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonModel extends Model{
  private String name;
  private String city;
  private String job;
  private String university;
  
	@Override
	public String toString() {
		  
		 return "Name: " + name + "\n" +
		    	"City: " + city + "\n" +
		    	"Job: " + job + "\n" +
		    	"University: " + university + "\n";
		  }
}





