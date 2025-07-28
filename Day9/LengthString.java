package Day9;

import java.util.Scanner;

public class LengthString {

    public static int getstringlength(String length){
        return length.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Input = sc.nextLine();
        int length = getstringlength(Input);
        System.out.println("Length of the string:" +length);
        sc.close();
    } 
}