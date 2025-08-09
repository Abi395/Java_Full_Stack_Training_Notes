package Day26;
//find the race car from the one district.If the car came from the same district omit and print the one district car only.
import java.util.*;
public class duplicates 
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int count=0,ans=0;
        System.out.print("Enter the elements:");
        int a[]=new int[n];
        for(int i=0;i<n;a[i++]=sc.nextInt());
        for(int i=0;i<n;i++)
        {         
            count=0;                              
            for(int j=i+1;j<n;j++ )
            {
                if(a[i]==a[j])
                {
                    count++;      
                }            
            }
            if(count==0)
            {
                ans++;
            }
        }
        System.out.println("Element is: "+ans);
        sc.close();
    }
}