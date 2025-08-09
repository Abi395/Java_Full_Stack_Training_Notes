package Day23.ProblemSolving;

// to find the numbers using user input and already the array present as default.
import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt(); //n=50
        int[] arr = {1,1,2,6,24,120,720,5040};
        for(int i=arr.length -1;i>=0;)//i=arr.length is an generic
        {
            if(n<arr[i]){ //50<5040 , 50<24(false)
                i--; //its will get decrement upto the lesser number than 50.
            }
            else{
                while(n>=arr[i]){ //it will check 50>=24
                    System.out.print(i+" "); //4
                    n=n-arr[i]; //50-24 =26, then 26-24=2,then 2-2=0
                }
                if(n==0){
                    break;//break the entire loop.
                }
            }
        }
        sc.close();
    }
}
