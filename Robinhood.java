
    import java.util.*;



    public class Robinhood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long start = n - k + 1;

            long odd = (n + 1) / 2 - (start / 2);

            if (odd % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
    
