class Solution {
    public int minimumSwaps(int[] nums) {
        int lp=0;
        int rp=nums.length-1;
        int k=0;
        while(lp<rp){
            if(nums[lp]==0 && nums[rp]!=0){
                nums[lp]=nums[rp];
                nums[rp]=0;
                lp++;
                rp--;
                k++;
            }else if(nums[lp]==0 && nums[rp]==0){
                rp--;
            }else{
            lp++;
            }
        }
        return k;
    }
}