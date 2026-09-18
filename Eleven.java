import java.util.*;

public class Eleven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] ans = new char[n + 1];

       
        Arrays.fill(ans, 'o');

        
        int a = 1;
        int b = 1;

        while (a <= n) {
            ans[a] = 'O';

            int next = a + b;
            a = b;
            b = next;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i]);
        }

        System.out.println();
    }
}