import java.util.Scanner;

/**
 * Created by nabil on 25 Dec 2022 at 23:20
 **/
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = input.nextLine();
        }

        for (String word : words) {
            if (word.length() <= 10) {
                System.out.println(word);
            } else {
                System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
            }
        }
    }
}
