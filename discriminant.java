import java.util.Scanner;

public class discriminant {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();

        double discriminate = Math.pow(b, 2)-4*a*c;

        if(discriminate < 0){
            System.out.println("No roots.");
        }
        else if(discriminate == 0){
            System.out.println("One root");
        }
        else if(discriminate > 0){
            System.out.println("Two roots");
        }
    }
    
}