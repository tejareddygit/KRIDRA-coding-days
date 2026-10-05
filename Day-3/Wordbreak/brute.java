import java.util.*;
class Solution {
    boolean solve(String s,int index,List<String> wordDict){
        if(index>=s.length()){
            return true;
        }
        for(int i=index;i<s.length();i++){
            String ans = s.substring(index,i+1);

            if(wordDict.contains(ans)){
               if(solve(s,i+1,wordDict)){
                return true;
               }
            }
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return solve(s,0,wordDict);
    }
}