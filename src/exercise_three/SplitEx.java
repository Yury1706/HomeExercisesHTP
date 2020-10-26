package exercise_three;

public class SplitEx {

    public static void main(String[] args) {

        String textString = "Привет опять привет и снова привет а может снова привет";
        System.out.println(textString);
        String[] words = textString.split(" ");

        System.out.println();

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            if (words[i] == null) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = null;
                    count++;
                }
            }
            System.out.println("Слово \"" + words[i] + "\", количество повторений - " + count);
        }
    }
}
