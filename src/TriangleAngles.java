import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first angle");
        int angle1=s.nextInt();
        System.out.println("Enter the Second angle");
        int angle2=s.nextInt();
        System.out.println("Enter the Third angle");
        int angle3=s.nextInt();
        int sum=angle1+angle2+angle3;
        if(angle1!=0 &&angle2!=0 && angle3!=0) {
            if (sum == 180) {
                System.out.println(angle1 + ", " + angle2 + ", " + angle3 + ", These angles forms a triangle");
            } else {
                System.out.println(angle1 + ", " + angle2 + ", " + angle3 + " These angles does not form a triangle");
            }
        }
        else {
            System.out.println("Every angle should be greater than zero");
        }
    }
}
