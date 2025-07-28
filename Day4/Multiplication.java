package Day4;

public class Multiplication {
    public static void main(String[] Mulof11) {
        int num = 121;
        int num1, num2, mid;
        num2 = num%10;
        num1 = num/100;
        mid = (num/10)%10;
        int firstdigit = num1+mid;
        int seconddigit = num2+mid;
        System.out.println(""+num1+firstdigit+seconddigit+num2);
    }
}
