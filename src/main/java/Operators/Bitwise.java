package Operators;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b =sc.nextInt();
        System.out.println(a<b & a>b);

    }
}
