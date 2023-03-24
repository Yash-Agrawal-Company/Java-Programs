package yash.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int d,r=0;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] -> Palindrome \n[2] -> Prime no.  ");
        System.out.print("Your choice (1/2) -> " );
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.printf("Enter any number -> ");
                int n = sc.nextInt();
                int org = n;
                while (n!=0){
                    d = n%10;
                    n = n/10;
                    r = r*10+d;
                }
                if (org == r) {
                    System.out.println("This is a palindrome number ");
                }
                else {
                    System.out.println("This is not a palindrome number ");
                }
                break;
            case 2:
                System.out.printf("Enter any number -> ");
                 n = sc.nextInt();
                 c = 0;
                for (int i = 1; i <= n; i++) {
                    if (n%i == 0) {
                        c = c+1;
                    }

                }
                if (c == 2) {
                    System.out.println("This is a prime number ");
                }
                else {
                    System.out.println("This is not a prime number ");
                }

        }

    }
}
