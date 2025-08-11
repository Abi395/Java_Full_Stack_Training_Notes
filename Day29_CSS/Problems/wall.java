package Day29_CSS.Problems;
import java.util.*;
public class wall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){// Read the input values into the array
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length-2;i++){// Iterate through the array except the last two elements
            ans = ans+arr[arr.length-2]-arr[i];// Calculate the difference between the second largest and the current element
        }
        System.out.println(ans);
        sc.close();
    }
}
