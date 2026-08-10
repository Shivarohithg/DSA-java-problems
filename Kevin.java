

import java.util.*;

public class Kevin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int odd = 0;
            int even = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0)
                    even++;
                else
                    odd++;
            }

            if (even > 0)
                System.out.println(odd + 1);
            else
                System.out.println(odd - 1);
        }

        sc.close();
    }
}
    

