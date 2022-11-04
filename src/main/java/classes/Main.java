package classes;

import com.github.javafaker.*;

public class Main {
    public static void main(String[] args) {
    	
        Faker faker = new Faker();
        String name1 = faker.name().fullName();
        String name2 = faker.name().fullName();
        String name3 = faker.name().fullName();
        String name4 = faker.name().fullName();
             
        System.out.println("Nome 1: "+name1);
        System.out.println("Nome 2: "+name2);
        System.out.println("Nome 3: "+name3);
        System.out.println("Nome 4: "+name4);
        
        
        //Utilizando a classe Figurinha
        
        Figurinha player = new Figurinha();
        player.setNome(faker.name().fullName());
        
        System.out.println("\nJogador: " + player);

    }
}