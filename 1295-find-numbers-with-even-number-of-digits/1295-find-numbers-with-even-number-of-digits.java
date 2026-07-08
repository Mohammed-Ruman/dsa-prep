class Solution {
    public int findNumbers(int[] nums) {
       if(nums.length==0) {
        return 0;
       }

       int count=0;
       for(int num:nums){
        String str=String.valueOf(num);
        int len=str.length();
        if(len%2==0){
            count++;
        }
       }
       return count;
    }
}