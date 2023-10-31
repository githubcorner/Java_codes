import java.util.Scanner;
public class vowelconsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char x = sc.next().charAt(0);
        sc.close();
        if('a'==x||'A'==x)
            System.out.println("Vowel");
        else if('e'==x||'E'==x)
            System.out.println("Vowel");
        else if('i'==x||'I'==x)
            System.out.println("Vowel");
        else if('o'==x||'O'==x)
            System.out.println("Vowel");
        else if('u'==x||'U'==x)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
