import java.util.*;

public class Snowfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            ArrayList<Integer> s6 = new ArrayList<>();
            ArrayList<Integer> s2 = new ArrayList<>();
            ArrayList<Integer> s3 = new ArrayList<>();
            ArrayList<Integer> s1 = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 6 == 0) {
                    s6.add(x);
                } else if (x % 2 == 0) {
                    s2.add(x);
                } else if (x % 3 == 0) {
                    s3.add(x);
                } else {
                    s1.add(x);
                }
            }

            for (int x : s6)
                System.out.print(x + " ");

            for (int x : s2)
                System.out.print(x + " ");

            for (int x : s1)
                System.out.print(x + " ");

            for (int x : s3)
                System.out.print(x + " ");

            System.out.println();
        }

        sc.close();
    }
}
