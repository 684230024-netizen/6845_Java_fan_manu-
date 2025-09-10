package Arrays;

public class W13_02__basicArray {
    public static void main(String[] args) {
        // การประกาศตัวแปรแบบ array แบบที่ 1 ระบุสมาชิกในวงเล็บ
        String animals [] = {"Dog", "Cat", "Lion"};
        int dice [] = {1,2,3,4,5,6};
        float avgScore [] = {3.50f, 4.00f, 2.75f};

        System.out.println("Size of animals array : " + animals.length);

        System.out.println("animal at index 0 : " + animals[0]);
        System.out.println("animal at index 2 : " + animals[2]);

        // วนลูปแสดงสมาชิกใน array  avgScore
        System.out.println("Show all average scores: " );
        for(int i=0; i<avgScore.length;i++){
            System.out.println(avgScore[i]);
            
        }

        //การประกาศตัวแปรแบบ array แบบที 2 ระบุขนาดของ array
        String[] colors = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";
        

        System.out.println("Size of colors array : " + animals.length);

        System.out.println("Show all average scores: " );
        for(int i=0; i<avgScore.length;i++){
            System.out.println("blook"+ j + " : " +colors[i]);
            j++;

        }

        System.out.println("color at index 0 : " + animals[0]);
        System.out.println("color at index 1 : " + animals[1]);

        int scores[] = new int[5];
        scores[0] = 50;

        System.out.println("score at index 4 : " + scores[4]);

    }
}
