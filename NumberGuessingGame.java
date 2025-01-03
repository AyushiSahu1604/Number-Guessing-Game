import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;
        // System.out.println("Random number is "+ randomNumber);

        System.out.println("\nLet's play Number Guessing Game.");
        System.out.println("Guess number between 1 to 100.\n");

        int count = 0;
        Instant Start = Instant.now();

        while(true){
            System.out.println("Enter the Number: ");
            int guessedNumber = scanner.nextInt();
            count++;

            if(guessedNumber < randomNumber){
                System.out.println("Oops... The Number is higher. Try Agarin! \n");
            }
            else if (guessedNumber > randomNumber) {
                System.out.println("Oops... The Number is lower. Try Agarin! \n");
            }
            else{
                System.out.println("\nCongrats... You Win!!!!!");
                System.out.println("You took "+count+" attempts to guess the number. ");
                Instant end = Instant.now();
                Duration timeTaken = Duration.between(Start, end);
                System.out.println("You took "+timeTaken.getSeconds()+" seconds to guess the number.\n");
                scanner.close();
                return;
            }    
        }
        
  }
}
