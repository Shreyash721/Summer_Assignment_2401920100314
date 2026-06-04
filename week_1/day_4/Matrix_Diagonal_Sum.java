class Solution {
    public int diagonalSum(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int ele=mat[r/2][c/2];
        int sum1=0,sum2=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum1=sum1+mat[i][j];
                }
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                if(i+j==c-1){
                    sum2=sum2+mat[i][j];
                }
            }
        }
        System.out.print(sum1);
        System.out.print(sum2);

        if(r%2==0) return sum1+sum2;

        return sum1+sum2-ele;
    }
}