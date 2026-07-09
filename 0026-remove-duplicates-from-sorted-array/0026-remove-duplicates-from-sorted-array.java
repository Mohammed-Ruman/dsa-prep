class Solution {
    public int removeDuplicates(int[] nums) {
        int sp=0;
        int fp=0;
        while(sp<nums.length && fp<nums.length){
            
            if(nums[sp]>=nums[fp]){
                fp++;
            }else {
                sp++;
                nums[sp]=nums[fp];
                fp=sp;
            }

        }
        return sp+1;
    }
}