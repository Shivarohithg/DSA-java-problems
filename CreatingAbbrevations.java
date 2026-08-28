import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Stores the first letters that are currently available
            boolean[] available = new boolean[26];

            // Initial lowercase words
            for (int i = 0; i < n; i++) {
                String word = sc.next();
                char first = Character.toUpperCase(word.charAt(0));
                available[first - 'A'] = true;
            }

            // Abbreviations
            String[] abbreviations = new String[m];

            for (int i = 0; i < m; i++) {
                abbreviations[i] = sc.next();
            }

            boolean[] created = new boolean[m];
            int createdCount = 0;

            // Keep trying to create abbreviations
            boolean changed = true;

            while (changed) {
                changed = false;

                for (int i = 0; i < m; i++) {

                    // Already created
                    if (created[i]) {
                        continue;
                    }

                    String abbr = abbreviations[i];

                    boolean possible = true;

                    // Check whether every character is available
                    for (char c : abbr.toCharArray()) {
                        if (!available[c - 'A']) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        created[i] = true;
                        createdCount++;

                        // This abbreviation can now be used as a word.
                        // Therefore its first letter becomes available.
                        available[abbr.charAt(0) - 'A'] = true;

                        changed = true;
                    }
                }
            }

            if (createdCount == m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}