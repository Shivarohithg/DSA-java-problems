
    import java.util.*;

    public class Robin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int robin = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {

                int x = sc.nextInt();

                if (x >= k) {
                    robin += x;
                } else if (x == 0 && robin > 0) {
                    robin--;
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
    

