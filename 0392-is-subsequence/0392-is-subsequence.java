class Solution {
    public boolean isSubsequence(String s, String t) {
        int slow=0;
        int fast=0;
        if(s.length()==0){return true;} 
        if( t.length()==0) {return false;}
        while(fast<t.length() && slow<s.length()){
            if(s.charAt(slow) == t.charAt(fast)){
                slow++;
                fast++;
            }else{
                fast++;
            }
        }
        return slow==s.length()?true:false;
    }
}