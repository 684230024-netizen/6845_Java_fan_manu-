package Arrays;
import java.util.Scanner;
public class W15_02_Sumnumber {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        double a [] = new double [5];
        

        for (int i=0 ; i<a.length ; i++){
            System.out.print("enter number " + (i+1) + " = ");
            a[i] = kb.nextDouble();

        }
        double sumAll = 0;
        double sumOdd = 0;
        double sumEvan = 0;
        double average = 0;
        double max = a[0];
        double min = a[0];

        System.out.println(" show all number");
        for(int i = 0 ;i<a.length ; i++){
            System.out.println("index [" + i + "] value = " + a[i]);
            

        if (a[i] % 2 != 0) {
            sumOdd += a[i];
        } else {
            sumEvan += a[i];
        }

        if(a[i] > max) {
            max = a[i];
        }

        if(a[i] < min) {
            min = a[i];
        }
    }

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Sum of all number = " + sumAll);
        System.out.println("Sum of odd number = " + sumOdd);
        System.out.println("Sum of odd number = " + sumEvan);
        System.out.println("max number = " + max);
        System.out.println("min number = " + min);

        average = sumAll / a.length;
        System.out.println("Avger of " + average);
        kb.close();
    }
}
// หาเลขคู่ ขี่ แล้วไม่เอาเลขคู่ เอาเเค่เลขขี่มาบวกกัน     