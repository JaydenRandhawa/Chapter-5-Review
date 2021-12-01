package chapter5Review;

import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        int sqrt = (int)Math.sqrt(num);

        if(num == sqrt*sqrt){
            System.out.print(num);
            System.out.println(" is a perfect square!");
        }
        else{
            System.out.print(num);
            System.out.println(" is not a perfect square.");
        }
    }
    
}
