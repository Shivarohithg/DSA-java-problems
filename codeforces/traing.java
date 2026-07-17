package codeforces;
import java.util.*;

public class traing {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] h = new int[n];
            int mx = 0;

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
                mx = Math.max(mx, h[i]);
            }

            int target = mx + 1;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                ans = Math.max(ans, target - h[i]);
            }

            System.out.println(ans);
        }
    }
}
    

