package Operators;

import java.util.Scanner;

public class IncreDecre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b =sc.nextInt();
        System.out.println("The result of a:" + ++a);
        System.out.println("The result of a:" + b++);
        System.out.println("The result of a:" + --a);
        System.out.println("The result of a:" + a--);
    }
}
