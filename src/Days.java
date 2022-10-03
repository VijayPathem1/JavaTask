import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the days");
        int days=s.nextInt();
        int month=days/30;
        int day=days%30;
        System.out.println("months="+month+" days="+day);
    }
}
