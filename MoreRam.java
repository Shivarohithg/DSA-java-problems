import java.util.*;

public class MoreRam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(1 + (n - 1) * k);
        }

        sc.close();
    }
}
    

