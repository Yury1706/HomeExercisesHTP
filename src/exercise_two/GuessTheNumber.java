package exercise_two;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        System.out.print("Enter a number (from 0 to 100): ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int count = 0;

        while (true) {
            int guess = (int) (Math.random() * 101);
            count++;
            if (guess == userInput) {
                System.out.println("Computer guess your number. The number of guesses are: " + count);
                break;
            }
        }
    }
}
