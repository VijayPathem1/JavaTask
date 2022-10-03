import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        char gender,marital;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give your marital status as M or N:");
        marital=sc.next().charAt(0);
        System.out.println("Give your gender as M or F:");
        gender=sc.next().charAt(0);
        System.out.println("Enter Age:");
        age= sc.nextInt();
        if (marital=='M')
        {
            System.out.println ("The driver is insured");
        }
        else if (gender=='M' && age>30 && marital=='N')
        {
            System.out.println ("Driver is insured");
        }
        else if (gender=='F' && age>25 && marital=='N')
        {
            System.out.println ("Driver is insured");
        }
        else
        {
            System.out.println ("Driver is not insured");
        }
    }
}
