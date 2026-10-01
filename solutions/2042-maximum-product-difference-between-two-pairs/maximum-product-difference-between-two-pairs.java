class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int minprod=nums[0]*nums[1];
        int maxprod=nums[n-1]*nums[n-2];
        int diff=maxprod-minprod;
        return diff;
    }
}