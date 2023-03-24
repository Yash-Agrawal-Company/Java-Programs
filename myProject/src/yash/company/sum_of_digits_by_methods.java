package yash.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class sum_of_digits_by_methods {
    public int sumDigits(int a){
       int d,s=0;
        while(a!=0){
            d = a%10;
            s = s+d;
            a = a/10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum_of_digits_by_methods sum = new sum_of_digits_by_methods();
        System.out.println("The sum of digits is "+sum.sumDigits(n));

    }
}
