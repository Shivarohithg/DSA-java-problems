

import java.util.*;

public class eatinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];
            int total = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                total += a[i];
            }

            boolean[] canWin = new boolean[n];

            // Try every starting player
            for (int start = 0; start < n; start++) {

                int[] b = a.clone();
                int remain = total;
                int cur = start;
                int last = -1;

                while (remain > 0) {
                    if (b[cur] > 0) {
                        b[cur]--;
                        remain--;
                        last = cur;
                    }
                    cur = (cur + 1) % n;
                }

                canWin[last] = true;
            }

            int ans = 0;
            for (boolean x : canWin)
                if (x)
                    ans++;

            System.out.println(ans);
        }
    }
}
    

