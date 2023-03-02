package dbFaker.dataServices;

import java.util.ArrayList;

import com.github.javafaker.Faker;

import dbFaker.dataModel.PersonModel;

public class DataServices {
	
	public static ArrayList<PersonModel> generateData(int howMany) {
		
		Faker faker = new Faker();        
        ArrayList<PersonModel> person = new ArrayList<>();
 
        for(int i =0; i < howMany; i++) {
        	 person.add(new PersonModel());       	 
        }
        
        for(int i=0;i<person.size();i++) {   
        	
        	 person.set(i, 
        			 
        	 PersonModel.builder()
        		 .name(faker.name().fullName().replace("'", ""))
        		 .city(faker.address().cityName().replace("'", ""))
        		 .job(faker.job().field())
        		 .university(faker.university().name().replace("'", ""))
        		 .build()
        			 
        	);      	  
        }
        
        return person;

	}

}
