package yash.company;

import java.util.Scanner;

public class easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int arr1[][] = new int[3][3];
        int d;
        System.out.println("Enter the elements of first matrix -: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix -: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The resultant matrix is -: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                d = arr[i][j]+arr1[i][j];
                System.out.print(d+" ");
            }
            System.out.println();
        }
    }
}
