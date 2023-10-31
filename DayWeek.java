import java.util.Scanner;
public class DayWeek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number:");
        int x= sc.nextInt();
        sc.close();
                switch(x)
                {
                    case 1:System.out.println("sunday");
                    break;
                    case 2:System.out.println("mon");
                    break;
                    case 3:System.out.println("tuesday");
                    break;
                    case 4:System.out.println("wednesday");
                    break;
                    case 5:System.out.println("thursday");
                    break;
                    case 6:System.out.println("friday");
                    break;
                    case 7:System.out.println("saturday");
                    break;
                    default:System.out.println("Not a week number");
                }
        }

    }

