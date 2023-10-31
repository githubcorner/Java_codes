import java.util.*;
public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();
        sc.close();
        int a= 1;
        while(x!=1)
        {
            a = a*x;
            x--;
        }
        System.out.println("factorial is "+a);
    }
}
