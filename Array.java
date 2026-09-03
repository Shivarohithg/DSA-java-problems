import java.util.*;

public class Array{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (int i = 0; i < n; i++) {

                int smaller = 0;
                int greater = 0;

                for (int j = i + 1; j < n; j++) {

                    if (a[j] < a[i]) {
                        smaller++;
                    }

                    else if (a[j] > a[i]) {
                        greater++;
                    }
                }

                System.out.print(Math.max(smaller, greater) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}