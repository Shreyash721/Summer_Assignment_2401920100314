class Solution {
    public int compress(char[] chars) {

        int index = 0; 
        int i = 0;    

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[index++] = current;

            if (count > 1) {
                String freq = String.valueOf(count);

                for (char digit : freq.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }

        return index;
    }
}