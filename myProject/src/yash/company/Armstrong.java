package yash.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int d,r=0;
        System.out.printf("Enter any number -> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int org = n;
        while (n!=0){
            d = n%10;
            n = n/10;
            r = r+d*d*d;
        }
        if (org == r) {
            System.out.println("This is a armstrong number ");
        }
        else{
            System.out.println("This is not a armstrong number ");
        }
    }
}
