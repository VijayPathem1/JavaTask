import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=d.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
