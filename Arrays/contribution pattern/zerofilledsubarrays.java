class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long consecutivezeroes = 0;
        for(int num:nums){
            if(num == 0){
                consecutivezeroes++;
            }
            else{
                consecutivezeroes = 0;
            }
            count += consecutivezeroes;
        }
        return count;
        
    }
}