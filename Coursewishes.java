import java.util.*;

public class Coursewishes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k + 1];

            for (int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n + 1];

            ArrayList<Integer>[] courses = new ArrayList[k + 2];

            for (int i = 0; i <= k + 1; i++) {
                courses[i] = new ArrayList<>();
            }

            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
                courses[b[i]].add(i);
            }

            ArrayList<Integer> ans = new ArrayList<>();


            for (int level = k; level >= 1; level--) {

                for (int course : courses[level]) {

                    for (int next = level; next <= k; next++) {
                        ans.add(course);
                    }
                }
            }

            System.out.println(ans.size());

            for (int x : ans) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}