import java.util.Scanner;
import java.lang.Math;

public class GuessGame {
  public static void main(String[] args) {
    int answer = (int)(Math.random() * 100) + 1;
    Scanner input = new Scanner(System.in);
    System.out.println("I'm thinking of a number between 1 and 100.");
    int guess = -1;
    while (guess != answer) {
      System.out.println("Enter your guess: ");
      guess = input.nextInt();
      if (guess == answer) {
        System.out.println("You guessed the number!\nYou win!");
        break;
      }
      else if (guess > answer) {
        System.out.println("Your guess is too high.");
      }
      else {
        System.out.println("Your guess is too low.");
      }
    }
    input.close();
  }
}