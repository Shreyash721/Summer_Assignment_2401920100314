class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;

            windowCount[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, windowCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}