package Loop;
import java.util.Scanner;
public class W12_01_For_SumNumber {
    public static void main(String[] args) {

        

        Scanner kb = new Scanner(System.in);

        
            System.out.print("enter a start number = ");
            int start = kb.nextInt(); 
            System.out.print("enter a stop number  = ");
            int stop = kb.nextInt();

        while(start >= stop){
            System.out.println( " Start number must be less than Stop number. ");    
            System.out.print("enter a start number = ");
            start = kb.nextInt();
            System.out.print("enter a stop number  = ");
            stop = kb.nextInt();
        }

            int sum = 0;
            int count = 1;

            // if (start<stop){
                for(int i = start; i<= stop ;i+=1) {
                    System.out.println("รอบที่ " + count++ + " :"+ sum + "+" + i + "=" + (sum+=i));
                
            //     }
            // }else{
            //     System.out..println( " Start number must be less than Stop number. ");
            // }
        }
    }
}
            



    

