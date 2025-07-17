package Loops;

import java.util.Scanner;

public class ATM_dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt=0;
        int maxattempt=4;
        int pin=1234;
        do{
            System.out.println("Enter your 4 digit pin: ");
            int enterpin= sc.nextInt();
            if (enterpin==pin)
            {
                System.out.println("access the card");
                break;
            }
            else
            {
                attempt++;
                System.out.println("Incorrect pin;");
            }
        }while(attempt<maxattempt);

    }
}
