package Loop;
import java.util.Scanner;

public class W11_04_doWhile_True_ChoseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);


//  แสดงเมนูเพื่อรับ choice
System.out.println("=====================================");

System.out.println("Menu");

System.out.println("Addition");

System.out.println("Subtraction =");

System.out.println("exit");

System.out.println("=====================================");


int choice;

do { 
    System.out.println("=====================================");  
    System.out.print("Enter your choice :");
    choice = kb.nextInt();
    
    
        Switch (choice) {
        case 1: 
        // แสดงข้อความรับตัวเลข 2 จำนวน
            System.out.println("enter number 1 = ");
            int num1 = kb.nextInt(); 
            System.out.println("enter number 2 = ");
            int num2 = kb.nextInt();

            int result = kb.nextInt();
            System.out.println("Addition Result:" + (num1 + num2));
            break; // ออกจาก siwit case
    
        case 2:
            System.out.println("enter number 1 = ");
            int num1 = kb.nextInt(); 
            System.out.println("enter number 2 = ");
            int num2 = kb.nextInt();

            System.out.println("Subtraction Result" + (num1 - num2));
            break; // ออกจาก siwit case
    
        case 3:
            System.out.println("Exitig the program. 1goodbye!");
            break; 

        default:
            System.out.println("Invalid choice. please try again"):


        } while (choice !=3 );

        }
    }
}

        //while (true) {

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
            // break;  
        //}


        // ตรวจสอบการเลือกเมนุ
//         if(choice == 1) {
//             break;
//         }else if (choice == 2) {
//             break;
//         }else if (choice == 3) {
//             break;
//         } else {
//             System.out.println("invalid choice. please try again");
            

//         }


//     }
        
//     }
// }

