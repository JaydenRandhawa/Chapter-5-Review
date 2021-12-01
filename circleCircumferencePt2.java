package chapter5Review;

import java.util.Scanner;

public class circleCircumferencePt2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rad = inp.nextInt();

        if(rad >= 0){
            System.out.println(Math.PI*rad*rad);
        }
        else{
            System.out.println("Negative radii are illegal.");
        }
    }
    
}
