package Day23.ProblemSolving;
//reverse the number and print it like-> 123456 --> 214365
import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        // System.out.print("Enter a number:");
        // int num = sc.nextInt();
        // int rev=0;
        // while(num>0){
        //      rev = ((rev*10)+(num%10));//for reverse the number.
        //      num = num/10;//to remove the last digit after getting it.
        // }
        // int ans = 0;
        // while(rev>0){
        //     ans = ans*100 + (rev%100);
        //     rev = rev/100;
        // }
        // System.out.println("\n"+ans);
        System.out.println("\n"+(int)Math.log10(22456)+1);
        sc.close();
    }
}
