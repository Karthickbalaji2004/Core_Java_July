package Control_stmts;

import java.util.Scanner;

public class Demo_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        if (age>=25){
            System.out.println("Welcome to Wonderla");
            System.out.println("Thrilling Games");
            System.out.println("Enter your Gender: ");
            String gender= sc.next();
            if ((gender.equals("Male")||gender.equals("male")))
            {
                System.out.println("Water Level is 40m");
            }
            else{
                System.out.println("Water Level is 20m");
            }
        }
        else{
            System.out.println("Thankyou");
        }
    }
}
