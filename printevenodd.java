import java.util.Scanner;
public class printevenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int x = sc.nextInt();
        sc.close();
        int i = 1;
        System.out.println("even numbers:");
        while(i<=x){
            if(i%2==0)
                System.out.print(""+i);
            i++;
        }
        System.out.println();
        System.out.println("odd numbers:");
        i = 1;
        while(i<=x){
            if(i%2!=0)
                System.out.print(""+i);
            i++;
        }
    }
}
