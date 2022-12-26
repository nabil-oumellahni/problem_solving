import java.util.Scanner;

/**
 * Created by nabil on 26 Dec 2022 at 00:36
 **/
public class Coloring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        int n, m , k;
        String ans = "YES";
        for (int i = 0; i < tests; i++) {
             n = input.nextInt();
             m = input.nextInt();
             k = input.nextInt();
            for (int j = 0; j < m; j++) {
                if (n/m != k) {
                    ans = "NO";
                    System.out.println(ans);
                    break;
                }
                else {
                    int[] arr = new int[m];
                    int rest = n%m;
                    for (int l = 0; l < m; l++) {
                        if (rest == 0) {
                            arr[l] = k;
                        }
                        else {
                            arr[l] = k+1;
                            rest--;
                        }
                    }
                }
            }
        }

    }
}
