class Solution {

    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {

            if (n % len != 0) {
                continue;
            }

            String pattern = s.substring(0, len);
            StringBuilder formed = new StringBuilder();

            int times = n / len;

            for (int i = 0; i < times; i++) {
                formed.append(pattern);
            }

            if (formed.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }
}