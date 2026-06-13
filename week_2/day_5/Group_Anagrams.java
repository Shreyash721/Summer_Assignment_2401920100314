class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {

            char[] letters = word.toCharArray();
            Arrays.sort(letters);

            String sortedWord = new String(letters);

            if (!groups.containsKey(sortedWord)) {
                groups.put(sortedWord, new ArrayList<>());
            }

            groups.get(sortedWord).add(word);
        }

        return new ArrayList<>(groups.values());
    }
}