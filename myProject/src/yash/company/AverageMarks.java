package yash.company;
import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        System.out.print("Enter the number of subjects -> ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("Enter marks -> ");
        double[] marks = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }
        double result = sum/n;
        System.out.printf("The average marks are -> "+result);
    }
}
