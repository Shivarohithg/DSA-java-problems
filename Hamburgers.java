import java.util.*;

public class Hamburgers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long answer = 0;


            for (int i = 0; i < n; i++) {

                long price = a[i];
                int customers = 0;

                for (int j = 0; j < n; j++) {

                    if (a[j] >= price) {
                        customers++;
                    }
                }

                long profit = price * customers;

                answer = Math.max(answer, profit);
            }

            System.out.println(answer);
        }

        sc.close();
    }
}