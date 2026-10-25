class Solution {
    public int findClosestNumber(int[] nums) {
        int distance=Integer.MAX_VALUE;
        int closest=0;
        for(int i=0;i<nums.length;i++)
        {
            int current=Math.abs(nums[i]);
            if(current<distance || (current==distance && nums[i]>closest))
            {
                distance=current;
                closest=nums[i];
            }
        }
        return closest;
    }
}