import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value");
        int a=s.nextInt();
        System.out.println("Enter b value");
        int b=s.nextInt();
        if(a!=b) {
            if(a>b)
            {
                System.out.println("a is the biggest number");
            }
            else{
                System.out.println("b is the biggest number");
            }
        }
    }
}
