import java.util.*;
public class Temprature_converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert celsius scale to farenheit scale");
        System.out.println("Enter 2 to convert farenheit to celsius scale");
        System.out.print("Enter the number:");
        int x= sc.nextInt();
        System.out.println("Enter the temprature:");
        float y = sc.nextFloat();
        float z;
        sc.close();
        if(x==1) {
            z = (y * 1.8f) + 32;
            System.out.format("Temprature in farenhietis =%2f", z);
        }
        else
        {
            z=(y-32)*0.56f;
            System.out.format("Temprature in celsius is =%.2f",z);
        }
    }
}
