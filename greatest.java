import java.util.*;
public class greatest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z= sc.nextInt();
        sc.close();
        System.out.println("greatest number is:");
        System.out.println(x>y&&y>z?x:y>z?y:z);
    }
}
