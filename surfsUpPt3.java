package chapter5Review;

import java.util.Scanner;

public class surfsUpPt3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int height = inp.nextInt();

        if(height >= 6){
            System.out.println("Great day for surfing!");
        }

        else if(height >= 3 && height <= 6){
            System.out.println("Go body boarding!");
        }

        else if(height >= 0 && height <= 3){
            System.out.println("Go for a swim.");
        }

        else{
            System.out.println("Whoa! What kind of surf is that?");
        }
    }
    
}
