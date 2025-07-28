package Day3;
public class LeapYear {
    public static void main(String[] args) {
         int year = 2100;
        if (year%100 ==0 ) // to check if last 2 digits are 00
        {
            if ((year/100)%4==0)//to check first 2 numbers divided by zreo
             {
                System.out.println("It is leap year");
            }
            else{
                System.out.println("not a leap year");
            }
        }
        else if ((year%4)==0) {
            System.out.println("It is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
