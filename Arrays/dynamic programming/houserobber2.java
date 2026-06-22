
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int case1 = roblinear(nums,0,n-2);
        int case2 = roblinear(nums,1,n-1);
        return Math.max(case1,case2);
    }
    private int roblinear(int[]nums,int start,int end){
        int s = end-start+1;
        if(s==1){
            return nums[start];
        }
        int[]dp = new int[s];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for(int i=2; i<s; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[start+i]);

        }
        return dp[s-1];
    
        
    }
}