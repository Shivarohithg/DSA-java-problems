import java.util.*;

public class Main {

    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int x = sc.nextInt();

            int count = 0;

            for (int y = x + 1; y <= x + 100; y++) {

                if (y - digitSum(y) == x) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
