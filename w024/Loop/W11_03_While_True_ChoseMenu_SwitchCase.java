package Loop;
import java.util.Scanner;

public class W11_03_While_True_ChoseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);




//===============================================================================
// แสดงข้อความรับตัวเลข 2 จำนวน
System.out.println("enter number 1 = ");
int num1 = kb.nextInt(); 
System.out.println("enter number 2 = ");
int num2 = kb.nextInt();







// ==================================================================================
        //  แสดงเมนูเพื่อรับ choice
        System.out.println("=====================================");

        System.out.println("Menu");
        
        System.out.println("Addition");
        
        System.out.println("Subtraction =");
        
        System.out.println("exit");
        
        System.out.println("=====================================");

        while (true) { 
            System.out.print("Enter your choice :");
            int choice = kb.nextInt();
            System.out.println("=====================================");  

            // if(choice == 1){
            // System.out.println("Addition Result:" + (num1 + num2));
            //     break;
            
            // }else if (choice == 2){
            // System.out.println("Subtraction Result" + (num1 - num2));
            //     break;
            
            // }else if (choice == 3){
            // System.out.println("Exitig the program.  goodbye!");
            //     break;    

            // } else {
            // System.out.println("invalid choice. please try again");
            //     break;  
        //}


        // ตรวจสอบการเลือกเมนุ
        Switch(choice) {
            case 1: 
            System.out.println("Addition Result:" + (num1 + num2));
                break;

            case 2:
            System.out.println("Subtraction Result" + (num1 - num2));
                break;

            case 3:
            System.out.println("Exitig the program. 1goodbye!");
                break; 
        }
        if(choice == 1) {
            break;
        }else if (choice == 2) {
            break;
        }else if (choice == 3) {
            break;
        } else {
            System.out.println("invalid choice. please try again");
            

        }


        }
        
    }
}

