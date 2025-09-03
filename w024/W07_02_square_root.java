import java.util.Scanner;
public class W07_02_square_root {
    public static void main(String[] args) {
        //nput; prompt  the user forr a number
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a number to find its square root: ");
        double number = kb.nextDouble();

        if(number > 0) {
        // Process; calculate the squar root of of the number
        double squareRoot = Math.sqrt(number);
        
        // output the aqquare root of the number
        System.out.println("square Root of "+ number+ " is "+Math.sqrt(number));

        } else {
        System.out.println("Eror: the number must be poslilve");
        } 
        
    }
}       
