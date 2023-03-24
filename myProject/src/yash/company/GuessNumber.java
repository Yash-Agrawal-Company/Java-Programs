package yash.company;


import java.util.Random;
import java.util.Scanner;

class Play{
    int number;
    int guessNumber;
    int noOfGuesses = 0;
    public Play(){
        Random ran = new Random();
        this.number = ran.nextInt(100);
    }
    void userInput(){
        System.out.print("Enter your guessed number -> ");
        Scanner sc = new Scanner(System.in);
        this.guessNumber = sc.nextInt();
    }
    boolean isRight(){
        noOfGuesses++;
        if (number == guessNumber) {
            System.out.format("You crack the number , it is \"%d\"\nIn \"%d\" attempts",number,noOfGuesses);
            return true;
        }
        else if(guessNumber > number){
            System.out.println("Your input is high . . .");
        }
        else if(guessNumber

                < number){
            System.out.println("Your input is low . . .");
        }
        return false;

    }
}
public class GuessNumber {
    public static void main(String[] args) {
        Play bro = new Play();
        boolean choice = false;
        while(!choice){
            bro.userInput();
            choice = bro.isRight();
            if (choice == true) {
                break;
            }
            System.out.println(choice);
        }

    }
}
