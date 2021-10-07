import java.util.Scanner;

public class CharactersCounting {
    public static void main(String[] args) {
        String str = " hoang vi xinh dep ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character to count: ");
        char character = scanner.next().charAt(0);
        int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if (character==a) {
                    count++;
                }

            }

        System.out.println(character + " appears at " + str + " " + count + " times");
    }
}
