class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int[] freq=new int[101];
        for(int num:nums)
        {
            freq[num]++;
        }
        int mid=nums[nums.length/2];
        if(freq[mid]==1)
        {
            return true;
        }
        return false;
    }
}