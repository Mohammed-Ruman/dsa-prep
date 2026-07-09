class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]!=val){
                int temp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=temp;
                slow++;
                k++;
            }
            fast++;
        }
        return k;
    }
}