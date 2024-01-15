import java.util.Random;
import java.util.Scanner;
// import java.util.Math;

public class GuessingNumGame {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nPress 1 and ENTER to play\t\tPress another key and ENTER to exit");
            int num = sc.nextInt();

            if (num == 1) {
                guessGame();
                continue;
            }
            break;
        }
    }

    public static void guessGame() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int attempts = 10;

        int randomNum = random.nextInt(100);

        System.out.println("************************* Welcome to the Guessing Game *************************");
        System.out.println("\t\tGuess the Random Generated Number");
        System.out.println("********************************************************************************");

        System.out.println("You Left with "+attempts+" attempts");

        while (attempts > 0) {
            System.out.print("Enter Num: ");
            int num = sc.nextInt();

            if (num == randomNum) {
                System.out.println("Congratulations!! You guessed the correct Number");
                break;
            }
            else if (num > randomNum) {
                attempts--;
                System.out.println("Number of Attempts Left: "+ attempts+"\nHINT: Your value is higher than the number, Try again");
            }
            else if (num < randomNum) {
                attempts--;
                System.out.println("Number of Attempts Left: "+ attempts+"\nHINT: Your value is lesser than the number, Try again");
            }

            if (attempts <= 0) {
                System.out.println("Sorry, No attempts left\nBetter Luck Next Time!!");
            }
        }

        System.out.println("\nThe number was: "+randomNum);
        System.out.println("Your Score was: "+attempts*10);
        System.out.println("Press any key and ENTER to Continue");
        sc.next();

    }
}