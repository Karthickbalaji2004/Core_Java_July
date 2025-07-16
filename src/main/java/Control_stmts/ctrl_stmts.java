package Control_stmts;

import java.util.Scanner;

public class ctrl_stmts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Weight:");
        int weight = sc.nextInt();
        if (weight >= 25)
        {
            System.out.println("Eligiblie to play");
            if (weight==25 && weight<=35)
            {
                System.out.println("You are eligible for water games");
            }
            else if (weight>=36 && weight<=45)
            {
                System.out.println("You are eligible to play rollercoast");
            }
            else
            {
                System.out.println("you can play all games");
            }
        }
        else
        {
            System.out.println("you are not eligible to play");
        }
    }
}