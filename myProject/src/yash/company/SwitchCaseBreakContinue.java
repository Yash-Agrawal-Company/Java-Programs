package yash.company;
import java.util.Scanner;
public class SwitchCaseBreakContinue {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence -> ");
        String name = sc.nextLine();
        while(i<=name.length()){
            switch (name.charAt(i)){
                    case 'a':
                    continue;
                    case 'e':
                    continue;
                    case 'i':
                        continue;
                    case 'o':
                        continue;
                    case 'u':
                        continue;
                    case 'A':
                        continue;
                    case 'E':
                        continue;
                    case 'I':
                        continue;
                    case 'O':
                        continue;
                    case 'U':
                        continue;
                        default:
                    break;

            }


        }
        System.out.println(name);


    }
}
