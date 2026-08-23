import java.util.*;

public class Papyrus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++)
                b[i] = sc.nextInt();

            
            boolean possible = true;
            int cost1 = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    possible = false;
                    break;
                }
                cost1 += a[i] - b[i];
            }

            int answer = Integer.MAX_VALUE;

            if (possible) {
                answer = cost1;
            }

           
            Arrays.sort(a);
            Arrays.sort(b);

            possible = true;
            int cost2 = c;

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    possible = false;
                    break;
                }

                cost2 += a[i] - b[i];
            }

            if (possible) {
                answer = Math.min(answer, cost2);
            }

            if (answer == Integer.MAX_VALUE)
                System.out.println(-1);
            else
                System.out.println(answer);
        }

        sc.close();
    }
}