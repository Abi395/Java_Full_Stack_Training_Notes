package Day6;

public class SumOfDigits {
    public static void main(String[] args) {
        int day = 86;
        System.out.print((day%9)==0?"" :day%9);
        for(int q = day/9; q>0; q--)
        System.out.print(9);
    }
}
