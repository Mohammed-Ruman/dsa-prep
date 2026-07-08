class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int lp=0;
        int rp=nums.length-1;
        int revCount=nums.length-1;
        while(lp<=rp){
            int num1=nums[lp] * nums[lp];
            int num2 = nums[rp] * nums[rp];
            if(num1>num2){
                res[revCount]=num1;
                revCount--;
                lp++;
            }else{
               res[revCount]=num2; 
               revCount--;
                rp--;
            }
        }
        return res;
    }
}