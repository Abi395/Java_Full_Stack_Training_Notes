package Day6;

class CSE {
    public int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n* factorial(n-1);
    }
}
public class Fact_Fibo {

    public static int fibonacci(int n){
        if(n==1 || n==0){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        CSE trainer = new CSE();
        int n = 5;
        System.out.println( trainer.factorial (n));
        System.out.println(fibonacci(n));
    }
}
