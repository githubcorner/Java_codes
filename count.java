import java.util.*;
public class count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number for counting the digits");
        int num = sc.nextInt();
        int c =0;
        while(num>0)
        {
            c = c+1;
            num = num/10;
        }
        sc.close();
        System.out.println("no of digits:"+c);
    }

}
