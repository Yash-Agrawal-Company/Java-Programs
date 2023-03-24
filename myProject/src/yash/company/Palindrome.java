package yash.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int d,r=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter any number -> ");
        int n = sc.nextInt();
        int org = n;
        while (n!=0){
            d = n%10;
            n = n/10;
            r = r*10+d;
        }
        if (org == r)
            System.out.println("This is a palindrome number ");

        else
            System.out.println("This is not a palindrome number ");

    }
}
