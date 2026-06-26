class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        return findLCP(strs, 0, strs.length - 1);
    }

    private String findLCP(String[] strs, int left, int right) {
        
        if (left == right) return strs[left];

        int mid = left + (right - left) / 2;

        
        String lcpLeft = findLCP(strs, left, mid);
        String lcpRight = findLCP(strs, mid + 1, right);

        
        return commonPrefix(lcpLeft, lcpRight);
    }

    private String commonPrefix(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1.substring(0, minLen);
    }
}