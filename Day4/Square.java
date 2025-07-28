package Day4;

public class Square {
    public static void main(String[] args) {
        int num = 16;
        int a = num/10;
        int b = num%10;

        int aSquare = a * a;
        int twoAB = 2 * a * b;
        int bSquare = b * b;

        twoAB += bSquare / 10;
        bSquare = bSquare % 10;

        aSquare += twoAB/10;
        twoAB = bSquare%10;

        System.out.println("" +aSquare + twoAB + bSquare);
    }
}
