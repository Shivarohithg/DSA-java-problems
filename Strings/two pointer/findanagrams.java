import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class findAnagrams {

    public List<Integer> FindAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] window = new int[26];

        // Count frequency of pattern
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        // Build first window
        for (int i = 0; i < k; i++) {
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, window)) {
            ans.add(0);
        }

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            window[s.charAt(i - k) - 'a']--;
            window[s.charAt(i) - 'a']++;

            if (Arrays.equals(pCount, window)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}