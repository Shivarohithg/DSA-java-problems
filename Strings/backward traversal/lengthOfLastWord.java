// two while loops don't restart from beginning so time complexity is o(n), space complexity O(1)

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}