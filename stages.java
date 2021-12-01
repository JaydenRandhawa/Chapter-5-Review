package chapter5Review;

import java.util.Scanner;

public class stages {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int age = inp.nextInt();

        if(age > 18){
            System.out.println("adult");
        }

        else if(age <= 5){
            System.out.println("toddler");
        }
        
        else if(age <= 10){
            System.out.println("child");
        }

        else if(age <= 12){
            System.out.println("preteen");
        }
        else{
            System.out.println("teen");
        }
    }
    
}
