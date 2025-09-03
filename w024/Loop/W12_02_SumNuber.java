package Loop;
import java.util.Scanner;
public class W12_02_SumNuber {
    public static void main(String[] args) {
        // ใช้ do while วนรับค่าไปเรื่อย


        Scanner kb = new Scanner(System.in);

        int start, stop;
        do{    
            System.out.print("enter a start number = ");
            start = kb.nextInt();
            System.out.print("enter a stop number  = ");
            stop = kb.nextInt();

            int sum = 0;
            int count = 1;

            if (start<stop){
                for(int i = start; i<= stop ;i+=1) {
                    System.out.println("รอบที่ " + count++ + " :"+ sum + "+" + i + "=" + (sum+=i));
                
                }
            }else{
                System.out.println( " Start number must be less than Stop number. ");
            }
        } while (start >= stop);      
        kb.close();   
    }
}

    

