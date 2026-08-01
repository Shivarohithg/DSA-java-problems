import java.util.*;

public class Nephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.println((3 - n % 3) % 3);
        }

        sc.close();
    }
}