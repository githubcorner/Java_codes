import java.util.Scanner;
public class primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int x = sc.nextInt();
        sc.close();
        int i;
        for(i=2;i<x;i++)
        {
            if(x%i==0)
                break;
        }
        if(i==x)
            System.out.println("Prime number");
        else
            System.out.println("Not Prime Number");
    }
}
