package Day21.ProblemQuestions;

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int ans=0;

        //instead of while we can use forloop
        for(int i=num;i!=0;ans=ans+(int)Math.pow(i%10,((int)Math.log(num)+1)),i=i/10);
        System.out.println((ans==temp)?("Yes"):("No"));
        //while loop
        // while(num>0){
        //     int d = num%10;
        //     sum += d*d*d;
        //     num = num/10;
        // }
        // System.out.println((sum==temp)?("Armstrong"):("Not an Armstrong"));
        sc.close();
    }
}
