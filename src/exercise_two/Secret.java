package exercise_two;

import java.util.Scanner;

public class Secret {

    public static void main(String[] args) {

        System.out.println("Try to answer on my riddle and get 10$ from me. The question is:");
        System.out.println("How many rabbits are in my box?");
        System.out.println("Before you write your answer, I should say that you have only 10 attempts. Be careful");
        System.out.println("Oh... If you are a loser, just write \"loser\" and I show you the answer");
        Scanner scanner = new Scanner(System.in);
        String theRightAnswer = "five";
        int numberOfAnswer = 1;
        int attempts = 0;

        while (attempts < 10) {
            System.out.print("Your answer number " + numberOfAnswer + " is: ");
            String answer = scanner.nextLine();
            attempts++;

            if (answer.equalsIgnoreCase("loser")) {
                System.out.println("You made " + attempts + " attempts");
                System.out.println("The answer was " + theRightAnswer);
                break;
            } else if (answer.equalsIgnoreCase(theRightAnswer)) {
                System.out.println("It's awesome. You are right!!! Great job!");
                System.out.println("You made " + attempts + " attempts");
                break;
            } else {
                if (attempts == 8) {
                    System.out.println("I think you are in trouble...");
                } else if (attempts == 9) {
                    System.out.println("This is the last chance. Get rich or die trying)))");
                } else if (attempts == 10) {
                    System.out.println("Game over. You can't guess. My money are still with me)))");
                } else System.out.println("You are wrong! Next try:");
            }

            numberOfAnswer++;
        }
    }
}
