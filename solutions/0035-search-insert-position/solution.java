class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if((target>nums[i]) && (target<nums[i+1]))
            {
                return i+1;
            }
        }
        if(nums[nums.length-1]==target)
        {
            return nums.length-1;
        }
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        if(nums[0]>target)
        {
            return 0;
        }
        return nums.length;
    }
}
