class Solution {
    int lcs(String s1,int n,String s2,int m){
        if(n==-1||m==-1){
            return 0;
        }
        if(s1.charAt(n)==s2.charAt(m)){
            return 1+lcs(s1,n-1,s2,m-1);
        }
        int left = lcs(s1,n-1,s2,m);
        int right = lcs(s1,n,s2,m-1);

        return Math.max(left,right);

    }
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1,text1.length()-1,text2,text2.length()-1);
    }
}

//this was done by basic recurison which will leads to TLE lets optimsize it