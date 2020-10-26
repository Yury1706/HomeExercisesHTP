package exercise_three;

import java.util.Scanner;

public class NameAndAge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nameUser = scanner.nextLine();
        System.out.print("Enter your age: ");
        int ageUser = scanner.nextInt();

        String str = "Добрый день %s. Вы хорошо выглядите в свои %d!!!";
        String formatedString = String.format(str, nameUser, ageUser);
        System.out.println(formatedString);
    }
}
