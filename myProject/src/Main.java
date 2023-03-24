import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        System.out.print("Enter the number of words ->");
        int n = sc.nextInt();
        String arr[]  = new String[n];
        System.out.print("==================Enter the words==================\n");
        for (int i = 0; i < n; i++) {
            System.out.printf("For position %d -> ",i);
            arr[i] = sc.next();
            buffer.append(arr[i]+" ");
        }
        System.out.println("Your world were -> "+buffer);
    }
}