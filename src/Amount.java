import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter item price");
        int itemprice=s.nextInt();
        System.out.println("Enter item's quantity");
        int quantity=s.nextInt();
        int totalamt=itemprice*quantity;
        double sum=0;
        if(quantity>=10)
        {
            sum=totalamt+totalamt*0.1;
            System.out.println("total amount= "+sum);
        }
        else{
            System.out.println("total amount= "+totalamt);
        }
    }
}
