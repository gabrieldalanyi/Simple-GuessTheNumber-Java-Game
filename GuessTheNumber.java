import java.util.Random;
import java.util.Scanner;

// Simple GuessTheNumber Java Game
// Guess the number between 1 and 100
public class GuessTheNumber {

    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1 and 100");

        while (numberOfTries < 10) {
        System.out.print("Guess #" + (numberOfTries + 1) + ": ");
        int guess = scanner.nextInt();
        numberOfTries++;

        if (guess == numberToGuess) {
        System.out.println("Congratulations, you guessed the number in " + numberOfTries + " tries!");
        return;
        } else if (guess < numberToGuess) {
            System.out.println("Too low");
              } else {
                 System.out.println("Too high");
        }
                }

                System.out.println("Sorry, you have run out of tries. The number was " + numberToGuess);
    }

}


