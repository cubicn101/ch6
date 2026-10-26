
import java.util.Scanner;

public class Doubloon  {

    public static boolean isDoubloon(String word) {
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }

            if (count != 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.next();

        System.out.println(isDoubloon(word));
    }
}
