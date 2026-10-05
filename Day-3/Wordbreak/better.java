import java.util.*;
class Solution {

    boolean solve(String s,int index,List<String> wordDict,Boolean[] dp){
        if(index>=s.length()){
            return true;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        for(int i=index;i<s.length();i++){
            String ans = s.substring(index,i+1);

            if(wordDict.contains(ans)){
               if(solve(s,i+1,wordDict,dp)){
                return dp[index] = true;
               }
            }
        }
        return dp[index] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];
        return solve(s,0,wordDict,dp);
    }
}
