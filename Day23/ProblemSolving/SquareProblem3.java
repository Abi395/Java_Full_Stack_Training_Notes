package Day23.ProblemSolving;

import java.util.*;
public class SquareProblem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number:");
        // int n = sc.nextInt(); //n=70
        // int[] arr = {0,1,4,9,16,25,36,49,64,81,100};
        // for(int i=arr.length -1;i>=0;)//i=arr.length is an generic
        // {
        //     if(n<arr[i]){ //70<100 , 70<64(false)
        //         i--; //its will get decrement upto the lesser number than 50.
        //     }
        //     else{
        //         while(n>=arr[i]){ //it will check 70>=64
        //             System.out.print(i+" "); //4
        //             n=n-arr[i]; //70-25=45, then 45-36=9, then 9-9=0
        //         }
        //         if(n==0){
        //             break;//break the entire loop.
        //         }
        //     }
        // }


        //Optimizes code to find the largest square number less than or equal to n
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // int r=0;
        // while(n>0){
        //     r=(int)Math.sqrt(n);
        //     System.out.print(r+" ");
        //     n=n-r*r;
        // }

        //without using variable
        for(int i=sc.nextInt();i!=0;System.out.print((int)Math.sqrt(i)),i=i-(int)Math.sqrt(i)*(int)Math.sqrt(i));
        sc.close();
    }
}

