import java.util.*;

public class Riptide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int[] arr = {a, b, c};
            Arrays.sort(arr);

            a = arr[0];
            b = arr[1];
            c = arr[2];

            int count = 0;

            while (a != b && b != c) {
                a++;
                c--;
                count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}