import java.util.*;

public class Towers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int maxBoxes = d / m + 1;
            int towers = 0;

            for (int i = 0; i < n; i += maxBoxes) {
                towers++;
            }

            System.out.println(towers);
        }
    }
}