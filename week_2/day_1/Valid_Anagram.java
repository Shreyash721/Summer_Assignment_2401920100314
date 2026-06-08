class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ss=s.toCharArray();
        char [] tt=t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int i=0;
        int j=ss.length;
        if(ss.length!=tt.length) return false;
        
        while(i<j){
            if(ss[i]!=tt[i]) return false;
            i++;

        }
        return true;
    }
}