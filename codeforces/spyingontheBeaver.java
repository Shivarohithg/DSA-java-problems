import java.util.*;

public class Main {

    static ArrayList<Integer>[] tree;
    static boolean[] dam;
    static boolean[] hasDam;
    static ArrayList<Integer> answer;

    static void dfs(int u) {

        int cnt = 0;

        // First determine which child subtrees contain dams
        for (int v : tree[u]) {
            dfs(v);

            if (hasDam[v]) {
                cnt++;
            }
        }

        // Does this subtree contain a dam?
        hasDam[u] = dam[u] || cnt > 0;

        // If u itself is a dam, every child subtree
        // containing a dam needs a camera.
        if (dam[u]) {

            for (int v : tree[u]) {
                if (hasDam[v]) {
                    answer.add(v);
                }
            }

        } else {

            // If u is not a dam, we only need cameras
            // on all but one child subtree.
            boolean skipped = false;

            for (int v : tree[u]) {

                if (hasDam[v]) {

                    if (!skipped) {
                        skipped = true;
                    } else {
                        answer.add(v);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            tree = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                tree[i] = new ArrayList<>();
            }

            for (int i = 2; i <= n; i++) {
                int p = sc.nextInt();
                tree[p].add(i);
            }

            int m = sc.nextInt();

            dam = new boolean[n + 1];

            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                dam[x] = true;
            }

            hasDam = new boolean[n + 1];
            answer = new ArrayList<>();

            dfs(1);

            System.out.print(answer.size());

            for (int x : answer) {
                System.out.print(" " + x);
            }

            System.out.println();
        }
    }
}
