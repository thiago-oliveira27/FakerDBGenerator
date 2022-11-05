package classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String name;
  private String birthDate;
  private String university;
  private String skill;
  private String favoriteGame;
  private String country;
  private String favoriteColor;

  @Override
  public String toString() {
      return "Name: " + name + "\n" +
    		  "Birth date: " + birthDate + "\n" +
    		  "University: " + university + "\n" +
    		  "Skill: " + skill + "\n" +
    		  "Favorite Game: " + favoriteGame + "\n" +
    		  "Country: " + country + "\n" +
    		  "Favorite Color: " + favoriteColor + "\n" ;
  }


}
