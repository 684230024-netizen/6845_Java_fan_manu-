import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main(String[] atgs) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Base =");
        int base = kb.nextInt();
        System.out.print("Enter Height =");
        int height = kb.nextInt();

        double area = 0.5* base* height;
        System.out.print("Area of triangle = " + area);
        kb.close();
    }
}