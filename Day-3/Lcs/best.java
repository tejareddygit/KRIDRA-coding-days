class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0)
            return 0;
        int n = text1.length(),m = text2.length();
        int dp[][] = new int[n][m];
        if(text1.charAt(0)==text2.charAt(0)) dp[0][0] = 1;
        for(int i=1;i<m;i++){
            if(text2.charAt(i)==text1.charAt(0)){
                dp[0][i] = 1; 
            }
            else{
                dp[0][i] = dp[0][i-1];
            }
        }
        for(int i=1;i<n;i++){
            if(text1.charAt(i)==text2.charAt(0)){
                dp[i][0] = 1;
            }
            else{
                dp[i][0] = dp[i-1][0];
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n-1][m-1];
    }
}

//this is tabulation appproach if we carefully observes we are using extra 2D array still we can make space optimisation
