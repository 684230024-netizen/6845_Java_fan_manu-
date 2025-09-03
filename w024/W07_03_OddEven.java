import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //input : รับค่าจำนวนเต็มจากผู้ใช้
        System.out.println("รับค่าจากผู้ใช่: ");
        int n = kb.nextInt();
        // Process : สูตรคำนวณเลขคุ่และเลขคี่
        // int remain = n%2;
        
        // Output : แสงผลลัพธ์
        if (n%2 == 0) {
            System.out.println("เลข " + n + " คือ คู่");            
        }else {
            System.out.println("เลข " + n + "คือ คี่");
        }
    }
    
}
