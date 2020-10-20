package exercise_two;

import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter number of a day: ");
        int day = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 0 && day < 32) {
                    System.out.println("That month has that day!!!");
                } else System.out.println("That month doesn't have that day");
                break;
            case 2:
                if (day > 0 && day < 29) {  // При условии, что год не высокосный...
                    System.out.println("That month has that day!!!");
                } else System.out.println("That month doesn't have that day");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 0 && day < 31) {
                    System.out.println("That month has that day!!!");
                } else System.out.println("That month doesn't have that day");
                break;

            default:
                System.out.println("The month of that number doesn't exist");
        }
    }
}
