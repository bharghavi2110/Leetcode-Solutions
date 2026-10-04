class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int maxsum=0;
        int minsum=0;
        for(int i=0;i<k;i++)
        {
            minsum+=nums[i];
        }
        for(int i=nums.length-1;i>=nums.length-k;i--)
        {
            maxsum+=nums[i];
        }
        return Math.abs(maxsum-minsum);
    }
}
