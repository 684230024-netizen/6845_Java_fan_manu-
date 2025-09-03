import java.util.Scanner;

public class W09_01_Calculategrade {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("รับค่าคะแนน");
        int score = kb.nextInt();


        if(score < 0 || score > 100) {
            System.out.println("คะแนนไม่อยู่ในช่วง 0-100");
        }else {
            if(score>=80){
                System.out.println("คะแนนได้ A");
            }else if(score>=70){
                System.out.println("คะแนนได้ B");
            }else if(score>=60){
                System.out.println("คะแนนได้ C");
            }else if(score>=50){
                System.out.println("คะแนนได้ D");
            }else {
                System.out.println("คะแนนได้ F");
            }
        }
        
    }
}
