package chapter5Review;

import java.util.*;

public class randomNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int min = inp.nextInt();
        int max = inp.nextInt();

        Random rand = new Random();

        System.out.println(rand.nextInt(max-min+1)+min);
    }
}