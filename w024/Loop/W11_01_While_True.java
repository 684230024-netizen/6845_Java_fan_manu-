package Loop;
import java.util.Scanner;
public class W11_01_While_True {
    public static void main(String[] args) {
        // เขียนโปรแกรมรับตัวเลขจากคีย์บอดไปเรื่อยๆ จนกระทั่งกดเบอรื  9 จึงจะหยุด
        
        Scanner kb = new Scanner(System.in);
        
        
        //System.out.print("Enter number :");
        //int num = kb.nextInt();
        while (true) {
    //no.1 
            // System.out.print("Enter Alphabet :");
            // int num = kb.nextInt();

            // if(num == 9) { // คำสั่งตรวจสอบออกจากลูป
            //     break; // คำสั่งที่ใช้ใรการออกลูป

            // }
            
    //no.2
                System.out.print("Enter Alphabet :");
                String alphbet = kb.nextLine();
                if(alphabet.equals("e")) { 
                    break;
            }

        }
    }
}

