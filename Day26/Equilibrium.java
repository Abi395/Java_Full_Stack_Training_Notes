package Day26;

import java.util.*;
public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;arr[i++]=sc.nextInt());
        int leftSum =0, rightSum=0;
        for(int i=0;i<n;i++) {
            rightSum += arr[i];
        }
        for(int i=0;i<n;i++) {
            rightSum -= arr[i];
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
            leftSum += arr[i];
        }
        sc.close();
    }
}
