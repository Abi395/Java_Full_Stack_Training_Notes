package Day9;

import java.util.Scanner;
public class Calculator {

    //without return type without argument
    public static void cal(){
        System.out.println("Calculator program");
    }

    //without return type without argument
    public static void line(){
        System.out.println("=====================");
    }

    //with return type with argument
    public static int add(int a,int b){
        return a+b;
    }

    //without return type with arguments
    public static void sub(int a,int b){
        System.out.println(a-b);
    }

    //with return type without arguments
    public static int mul(){
        int a = 10,b=5;
        return a*b;
    }

    //with return type with arguments
    public static int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        cal();
        line();
        System.out.println("Addition: " +add(a,b));
        sub(a,b);
        System.out.println(mul());
        System.out.println("Division: " +div(a,b));
        sc.close();
    }
}
