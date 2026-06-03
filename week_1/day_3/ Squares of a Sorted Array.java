class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr=new int[nums.length];
        int i=0;
        for(int x: nums){
            arr[i]=x*x;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }
}