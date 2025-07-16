package Control_stmts;

import java.util.Scanner;

public class Demo_elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Tell us company name :");
        String cmp_name= sc.next();
        if (cmp_name.equalsIgnoreCase("tcs")) {
            System.out.println("working in tcs");
        }
        else if (cmp_name.equalsIgnoreCase("wipro")) {
            System.out.println("working in wipro");
        }
        else if (cmp_name.equalsIgnoreCase("cts")){
            System.out.println("working in cts");
        }
        else {
            System.out.println("not working");
        }

    }
}
