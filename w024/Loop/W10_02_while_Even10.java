package Loop;

public class W10_02_while_Even10 {
    public static void main(String[] args) {
        // Loop while แสดงเลขคู่ 10 ตัวแรก โดยให้ค่าเริ่มต้นเท่ากับ 2
        
        int count = 2;
        int sum  = 0;
        while (count <=20 ) {

            sum = sum + count;
            

            if (count < 20) {
                System.out.print(count+"+");
            }else{
                System.out.print(count+" = " + sum);
            }
            count = count + 2;
            
            
    }
}
}
