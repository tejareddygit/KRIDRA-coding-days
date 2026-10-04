class Solution {
    int lcs(String s1,int n,String s2,int m,int[][] dp){
        if(n==-1||m==-1){
            return 0;
        }
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m)){
            return dp[n][m] = 1+lcs(s1,n-1,s2,m-1,dp);
        }
        int left = lcs(s1,n-1,s2,m,dp);
        int right = lcs(s1,n,s2,m-1,dp);

        return dp[n][m] = Math.max(left,right);

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(),m = text2.length();
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(text1,n-1,text2,m-1,dp);
    }
}
// this is recursion with DP(Memoisation) sometimes this will results in TLE so try to optimise
