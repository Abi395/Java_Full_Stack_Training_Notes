package Day6;

public class TrailingZero {
    public static void main(String[] args) {
        int n = 50;
        if(n>25 || n>125 || n>625 ){
            int s = n/5 ;
            int s1 = n/25;
            int s2 = (n/125) + (n/625);
            System.out.println(s + s1 + s2);
        }
        else{
            System.out.printf( "The factorial of n is : " + n* (n-1));
            
        }
        }
    }
