import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        s = s.toLowerCase();

        boolean[] present = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            present[ch - 'a'] = true;
        }

        boolean possible = true;

        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}