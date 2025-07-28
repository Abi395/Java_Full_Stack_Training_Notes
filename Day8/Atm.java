package Day8;

import java.util.Scanner;

public class Atm {
    public static void lines(){
        System.out.println("======================");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Luna's ATM");
        lines();
        Scanner sc = new Scanner(System.in);
        int pin_number = 1313; //default for comparing
        float Account_Balance = 500f;//account balace
        for(int attempt = 3;attempt>0;--attempt)//only 3 attempts
        {
                 int pin = sc.nextInt();//automatic pin check
                if(pin==pin_number){
                     System.out.println("Welcome user");
                     lines();
                     for(int x=1;x==1;)//for exit
                     {
                        System.out.println("1. Credit\n2. Debit\n3. Check Balance\n4. Change the PIN nmuber\n5. Exit");//options
                        int choice = sc.nextInt();
                        switch(choice)
                     {
                        case 1:
                        {
                            System.out.println("Enter the amount to be credited");
                            int amount = sc.nextInt();
                            lines();
                            Account_Balance = Account_Balance+amount;//add the amount that credited by user
                            System.out.printf("Amount added : %.2f\n",Account_Balance);
                            lines();
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Enter the amount to be debited");
                            int amount = sc.nextInt();
                            lines();
                            if(amount < Account_Balance){
                                Account_Balance = Account_Balance-amount;
                                System.out.printf("Amount added : %.2f\n",Account_Balance);
                                lines();
                            }
                            else{
                                System.out.println("Insufficient Balance");
                                lines();
                            }
                            break;
                        }
                        case 3:
                            {
                                System.out.printf("Current balance: %.2f\n", Account_Balance);
                                lines();
                                break;
                            }
                            case 4:
                            {
                                System.out.println("Enter the Current PIN");
                                int currentPin = sc.nextInt();
                                if(currentPin == pin_number){
                                    System.out.println("Enter the new PIN");
                                    int newPin = sc.nextInt();
                                    pin_number = newPin;
                                    System.out.println("PIN Changed Successfully");
                                    lines();
                                }
                                else{
                                    System.out.println("The current pin is incorrect");
                                }
                                break;
                            }
                            case 0:
                            {
                                x=0;
                                break;
                            }
                     }
                    }
                     break;//break the entire loop
                }
        else
        {
            // --attempt;
            // if(attempt>0){
            System.out.println("Enter the correct pin number only " + (attempt-1) + ((attempt>1)?" attempts":"attempt"+" left"));
        }
        }
        sc.close();
    }
}
