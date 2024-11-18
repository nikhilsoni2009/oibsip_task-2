package company.com;

import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    private int targetNumber;

    public GuessTheNumber(){
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
        System.out.println("Guess the Number From 1 to 100");
    }

    public int takeUserInput(){
       System.out.print("Enter your guess: ");
       Scanner sc = new Scanner(System.in);
       return sc.nextInt();

    }
    public void playGame(){
        int userGuess;
        int attemptCount = 0;
        do {
            userGuess = takeUserInput();
            attemptCount++;
            isCorrectNumber(userGuess);
        }while (userGuess!=targetNumber);

        System.out.println("YOU GUESSED THE NUMBER IN" + attemptCount + "ATTEMPTS!");
    }
    private void isCorrectNumber(int guess){
        if (guess == targetNumber){
            System.out.println("Correct! you guessed the number.");
        }else if (guess > targetNumber) {
            System.out.println("Your guess is too high.Try again.");
        } else {
            System.out.println("Your guess is too low.Try again.");
        }
    }
    public static void main(String[] args){
        GuessTheNumber game = new GuessTheNumber();
        game.playGame();
    }
}
