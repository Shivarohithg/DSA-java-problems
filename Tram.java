import java.util.*;

public class Tram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {

            int off = sc.nextInt();
            int on = sc.nextInt();

            current = current - off + on;

            max = Math.max(max, current);
        }

        System.out.println(max);

        sc.close();
    }
}