package chapter5Review;

import java.util.Scanner;

public class surfsUpPt2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int height = inp.nextInt();

        if(height >= 6){
            System.out.println("Great day for surfing!");
        }
        else{
            System.out.println("Go body boarding!");
        }
    }
    
}
