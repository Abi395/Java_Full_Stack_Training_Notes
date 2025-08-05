package Day23.ProblemSolving;
//reverse the number and print it like-> 123456 --> 214365
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int rev=0;
        while(num>0){
             rev = ((rev*10)+(num%10));
             num = num/10;
        }
        int ans = 0;
        while(rev>0){
            ans = ans*100 + (rev%100);
            rev = rev/100;
        }
        System.out.println("\n"+ans);
        sc.close();
    }
}
