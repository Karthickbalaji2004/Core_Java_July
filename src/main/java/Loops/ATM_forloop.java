package Loops;

import java.util.Scanner;

public class ATM_forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int attempt=0;
        int maxattempt=3;
        int pin=1234;
        for (attempt=0;attempt<=maxattempt;attempt++){
            System.out.println("Enter 4 digit pin: ");
            int enterpin= sc.nextInt();
            if(enterpin==pin){
                System.out.println("Access the card");
                break;
            } else if (attempt>=maxattempt) {
                System.out.println("You have reached max attempt");
                break;
            }
            else {
                System.out.println("Incorrect pin");
            }
        }
    }
}
