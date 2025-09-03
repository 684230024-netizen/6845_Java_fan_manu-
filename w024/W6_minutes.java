import java.util.Scanner;

public class W6_minutes {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("กรอกจำนวนวินาทีทั้งหมด: ");
        int s =kb.nextInt();
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int remainingSeconds = s % 60;

        System.out.println(s + " วินาที มีค่าเท่ากับ " 
                   + hours + " ชั่วโมง " 
                   + minutes + " นาที " 
                   + remainingSeconds + " วินาที");
        kb.close();
    }
}

