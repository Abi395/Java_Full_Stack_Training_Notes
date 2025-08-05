package Day21.ProblemQuestions;
//without using if else and +,-.
import java.util.*;
public class Case{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char a = sc.next().charAt(0);
         System.out.print("Enter the alphabet: ");
        char b = sc.next().charAt(0);
        System.out.println((char)(a^32));
        System.out.println((char)(b^32));

        //without using variable 
        //System.out.println((char)((sc.next().charAt(0))^32));
        sc.close();
    }
}