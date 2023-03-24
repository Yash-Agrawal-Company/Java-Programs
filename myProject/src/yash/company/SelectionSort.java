package yash.company;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int n,temp,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array -> ");
        n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.print("Enter the elements of array -> ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Performing the sorting of the array
        for (int i = 0; i < n - 1; i++) {
            min = i; // taking min as the smallest
            for (int j = i+1; j < n; j++) {
                if (arr[min]>arr[j]) {
                    min = j; // updating min by comparisons
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Printing the sorted array -> ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
