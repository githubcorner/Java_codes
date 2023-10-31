import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the terms:");
        int x=sc.nextInt();
        sc.close();
        int i;
        int p = 0;
        int q =1;
        System.out.println("0");
        System.out.println("1");
        for(i = 0;i<x-2;i++)
        {
            int s= 0;
            s = p+q;
            p = q;
            q = s;
            System.out.print(""+s);
        }
    }
}
