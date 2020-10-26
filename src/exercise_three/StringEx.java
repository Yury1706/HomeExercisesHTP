package exercise_three;

public class StringEx {

    public static void main(String[] args) {

        //Задание №1

        String stringResult = "";

        for (int i = 0; i < 1001; i++) {
            stringResult += i + " ";
        }
        System.out.println(stringResult);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 1001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);

        //Задание №2

        String regex = "\\b\\d{2}\\b";
        String regexOut = stringResult.replaceAll(regex, "-1");
        System.out.println(regexOut);
    }
}
