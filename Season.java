import java.util.Scanner;
public class Season{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number:");
        int x= sc.nextInt();
        sc.close();
        switch(x){
            case 1:System.out.println("winter");
            break;
            case 2:System.out.println("winter");
            break;
            case 3:System.out.println("Spring");
            break;
            case 4:System.out.println("Spring");
            break;
            case 5:System.out.println("summer");
            break;
            case 6:System.out.println("summer");
            break;
            case 7:System.out.println("Autumn");
            break;
            default:
                System.out.println("invalid choice");
        }
    }
}
