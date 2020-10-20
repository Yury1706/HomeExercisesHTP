package exercise_two;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        System.out.print("Enter a size of pyramid: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] pyramid = new int[size][size];
        int step = 0;

        if (size % 2 != 0) {            // Для нечетного значения длины пирамиды

            while (step <= size / 2) {

                for (int i = step; i < (pyramid.length - step); i++) {
                    for (int j = step; j < (pyramid.length - step); j++) {
                        pyramid[i][j] = step + 1;
                    }
                }
                step++;
            }
        } else {                        // Для четного значения длины пирамиды
            while (step < size / 2) {

                for (int i = step; i < (pyramid.length - step); i++) {
                    for (int j = step; j < (pyramid.length - step); j++) {
                        pyramid[i][j] = step + 1;
                    }
                }
                step++;
            }
        }

        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid.length; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}

