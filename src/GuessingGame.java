import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() {

        System.out.println("Howdy, what's your name? ");
        System.out.println("(type in your name) ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");
        //create an instance of the Random object
        Random random = new Random();
        //call method nextInt and pass in upper range bound
        int targetNum = random.nextInt(100) + 1;
        int totalGuesses = 0;

        while (true){

            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e){
                String invalidInput = input.next();
                System.out.println("That's not an integer, try again");
                continue;
            }
            if(guess < 1 || guess > 100){
                System.out.println(guess + " is not a valid number, try again!");
                continue;
            }
            totalGuesses = totalGuesses + 1;

            if(guess < targetNum) {
                System.out.println("Your guess is too low, try again.");
            } else if (guess > targetNum){
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Well done " + name);
                System.out.println("You found my number in " + totalGuesses + " tries!");
                break;
            }
        }
    }

}
