import java.util.Scanner;

/**
 * Created by nabil on 25 Dec 2022 at 23:17
 **/

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if (w > 2) {
            if (w % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
