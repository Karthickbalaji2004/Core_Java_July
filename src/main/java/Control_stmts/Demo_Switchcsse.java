package Control_stmts;

import java.util.Scanner;

public class Demo_Switchcsse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vowels:");
        String vowel=sc.next();
        switch (vowel){
            case"a":
            case"e":
            case"i":
            case"o":
            case"u":{
                System.out.println(vowel + " is a vowel");
                break;
            }
            default:{
                System.out.println("Not a vowel");
            }
        }
    }
}
