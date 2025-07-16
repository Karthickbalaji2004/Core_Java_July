package Operators;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Credit_Card {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your cibil score:");
        int cibilscore=sc.nextInt();
        if (cibilscore>=100 && cibilscore<=200)
        {
            System.out.println("You are eligible for amt 1 lakh");
        }
        else if (cibilscore>=201 && cibilscore<=300)
        {
            System.out.println("You are eligible for amt 2 lakhs");
        }
        else if (cibilscore>=301)
        {
            System.out.println("You are eligible for amt upto 5 lakhs");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}
