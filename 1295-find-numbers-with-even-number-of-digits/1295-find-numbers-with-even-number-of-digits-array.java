class Solution {
    public int findNumbers(int[] nums) {
       if(nums.length==0) {
        return 0;
       }

       int count=0;
       for(int num:nums){
        int currentCount=0;
        while(num>0){
            currentCount++;
            num=num/10;
        }
        if(currentCount%2==0){
            count++;
        }
       }
       return count;
    }
}