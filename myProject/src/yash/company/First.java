package yash.company;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age -> ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("This is not a valid statement ");
        }
        else if (a >=18) {
            System.out.println("your are eligible to drive a car ");
        }
        else{
            System.out.println("Baccha ho be , Aukat mein raho . . . ");
        }
    }
}
