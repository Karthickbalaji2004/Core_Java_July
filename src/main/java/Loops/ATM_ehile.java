package Loops;

import java.util.Scanner;

public class ATM_ehile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attempt=0;
        int maxattempt=4;
        int pin=1234;
        while (attempt<maxattempt) {
            System.out.println("Enter the 4 digit pin: ");
            int enterpin = sc.nextInt();
            if (enterpin == pin) {
                System.out.println("Access the card");
                break;
            } else {
                System.out.println("incorrect pin");
                attempt++;
            }

            if (attempt >= maxattempt) {
                System.out.println("You reached max attempt");
            } else {
                System.out.println("your card is block");
            }
        }
    }
}
