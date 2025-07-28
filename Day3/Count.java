package Day3;

public class Count {
    public static void main(String[] args) {
        int num = 2345;
        int count = 0;
        int sum = 0;
        int rev = 0;
        while(num>0)
        {
            count++;
            sum = sum +(num%10);
            rev = ((rev*10)+(num%10));
            num = num/10;
        }
        System.out.println("Count " +count);
        System.out.println("Sum of the digits " +sum);
        System.out.println("reversed digits " +rev);
    }
}
