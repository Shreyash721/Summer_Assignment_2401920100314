class Solution {
    public String reverseWords(String s) {
        String [] arr=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            String st=arr[i];
            char [] sr=st.toCharArray();
            for(int j=sr.length-1;j>=0;j--){
                str=str+sr[j];
            }
            if(i!=arr.length-1){
                str=str+" ";
            }
        }
        return str;
    }
}