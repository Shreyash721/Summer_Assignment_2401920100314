class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean found = false;
            while (j < t.length()) {
                if (t.charAt(j) == ch) {
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}