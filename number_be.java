    import java.util.*;
public class number_be{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (y > 2 * x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
    

