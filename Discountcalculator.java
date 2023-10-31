import java.util.Scanner;
public class Discountcalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of your purchase:");
        float x= sc.nextInt();
        sc.close();
        float y;
        System.out.println("After Discount:");
        if(x>=1000&&x<5000)
        {
            y = (x*5)/100;
            System.out.format("Amount to be paid=%.2f",x-y);
        }
        else if(x>=5000&&x<10000)
        {
            y = (x*10)/100;
            System.out.format("Amountto be paid=%.2f",x-y);
        }
        else if(x>20000)
        {
            y = (x*25)/100;
            System.out.format("Amount to be paid=%.2f",x-y);
        }
        else if(x>10000&&x<=20000)
        {
            y =(x*15)/100;
            System.out.format("Amount to be paid=%.2f",x-y);
        }
    }



}
