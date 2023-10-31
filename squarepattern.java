import java.util.Scanner;
public class squarepattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the square size:");
        int size = sc.nextInt();
        sc.close();
        for(int i =1;i<=size;i++)
        {
            for(int j=1;j<=size;j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
