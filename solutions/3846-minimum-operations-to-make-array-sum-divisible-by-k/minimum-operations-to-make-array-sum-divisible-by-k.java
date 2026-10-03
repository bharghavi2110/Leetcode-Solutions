class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }
        int operations=sum%k;
        if(operations==0)
        {
            return 0;
        }
        return operations;
    }
}