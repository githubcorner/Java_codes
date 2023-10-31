
import java.util.Scanner;
public class primenumberrange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int x= sc.nextInt();
        sc.close();
        int i;
        System.out.println("prime numbers");
        for(int j =2;j<=x;j++)
        {
            for(i =2;i<x;i++){
                if(j%i==0)
                    break;
            }
            if(i==j)
                System.out.print(""+j);
        }
    }
}