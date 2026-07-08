class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;
        int[] res=new int[2];
        while(lp<rp){
            int sum=numbers[lp]+numbers[rp];
            if(sum>target){
                rp--;
            }else if(sum<target){
                lp++;
            }else{
                res[0]=lp+1;
                res[1] = rp+1;
                return res;
            }
        }
         return res;
    }
}