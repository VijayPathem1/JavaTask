import java.util.Scanner;

public class GrossAmount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the amount");
        int amt =s.nextInt();
        double finalamt=0;
        double bonus = 0;
        double ta=amt*0.1;
        double da=amt*0.1;
        double hra=amt*0.1;
        double pf=amt*0.1;
        if(amt>=20000)
        {
            bonus=amt*0.1;
            System.out.println("bonus= "+bonus);
        }
        else
        {
            bonus=amt*0.2;
            System.out.println("bonus= "+bonus);
        }
        System.out.println("ta= "+ta);
        System.out.println("da= "+da);
        System.out.println("hra= "+hra);
        System.out.println("pf= "+pf);
        finalamt=amt+ta+da+hra+bonus-pf;
        System.out.println("gross final= "+finalamt);
    }
}
