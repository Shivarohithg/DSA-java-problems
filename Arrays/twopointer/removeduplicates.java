class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int i =0;
        int j = 1;
        int k = 1;
        while (j < nums.length) {

            if (nums[i] != nums[j]) {
                nums[k] = nums[j]; // place unique element
                k++;
                i = j;
            }

            j++;
        }

        return k;

    }
}