package chapter5Review;

import java.util.Scanner;

public class delivery {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double l = inp.nextDouble();
        double w = inp.nextDouble();
        double h = inp.nextDouble();

        if(l > 10 || w > 10 || h > 10){
            System.out.println("Reject");
        }
        else{
            System.out.println("Accept");
        }
    }
    
}
