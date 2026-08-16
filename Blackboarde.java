import java.util.*;

public class Blackboarde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long[] arr = {a, b, c};
            Arrays.sort(arr);

            a = arr[0];
            b = arr[1];
            c = arr[2];

            System.out.println(Math.min(c - a, b));
        }

        sc.close();
    }
}