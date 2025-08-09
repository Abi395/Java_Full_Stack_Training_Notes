package Day26;

import java.util.*;
public class Denominations 
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int t=sc.nextInt();
        System.out.print("Enter the purchase amount: ");
        int pv=sc.nextInt();
        System.out.print("Enter the balance amount:");
        int r=t-pv;
        System.out.print("Enter the size of denominations: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            while(r>=a[i])
            {
                System.out.print(a[i]+" ");
                r=r-a[i];
            }
            if(r==0)
                break;
        }
        sc.close();
    }
}
