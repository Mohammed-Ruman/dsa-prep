class Solution {
    public boolean isPalindrome(String s) {
        int lp=0;
        int rp=s.length()-1;
        while(lp<rp){
            if(!isAlphaNumeric(s.charAt(lp))){
                lp++;
                continue;
            }

            if(!isAlphaNumeric(s.charAt(rp))){
                rp--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(lp))!=Character.toLowerCase(s.charAt(rp))){
                return false;
            }else{
                lp++;
                rp--;
            }

        }
        return true;
    }
    private boolean isAlphaNumeric(char ch){
    
    return (ch >= 'a' && ch <= 'z') || 
                         (ch >= 'A' && ch <= 'Z') || 
                         (ch >= '0' && ch <= '9');
}
}

