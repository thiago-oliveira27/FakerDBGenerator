package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
    	
        Faker faker = new Faker();        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        ArrayList<Person> person = new ArrayList<>();
        
        String underscore = "__________________________________";
        for(int i =0;i<5;i++) {
        	 person.add(new Person());       	 
        }
        
        //Setting random data to each person in Person array
        for(int i=0;i<person.size();i++) {        	
        	 person.get(i).setName(faker.name().fullName());
        	 person.get(i).setUniversity(faker.university().name());
        	 person.get(i).setBirthDate(sdf.format(faker.date().birthday()));
        	 person.get(i).setSkill(faker.job().keySkills());
        	 person.get(i).setFavoriteGame(faker.esports().game());
        	 person.get(i).setCountry(faker.country().name());
        	 person.get(i).setFavoriteColor(faker.color().name());        	 
        }
        	
        // Printing person data without enumerating each one
        // Using forEach structure to simplify a loop
        
        person.forEach( c -> System.out.println(c + underscore + "\n"));
        	
        // Printing while enumerating person
        
        /*
        int n=1;
        for(int i=0;i<person.size();i++) {           	
           System.out.printf("\n*Person %d*\n%s",n, person.get(i)); 
           System.out.println(underscore);
           n++;
        } 
   	 	*/
        
        System.exit(0);      
    }
}