import java.util.*;

public class evanescent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int groups = 1;

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    groups++;
                }
            }

            int answer = groups;

            for (int i = 1; i < n - 1; i++) {

                int oldBoundaries = 0;

                if (s.charAt(i) != s.charAt(i - 1))
                    oldBoundaries++;

                if (s.charAt(i) != s.charAt(i + 1))
                    oldBoundaries++;

                int newBoundary = 0;

                if (s.charAt(i - 1) != s.charAt(i + 1))
                    newBoundary = 1;

                int newGroups =
                    groups - oldBoundaries + newBoundary;

                answer = Math.min(answer, newGroups);
            }

            System.out.println(answer);
        }
    }
}
