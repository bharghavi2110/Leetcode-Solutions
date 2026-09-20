class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=0;
        for(int i=0;i<n;i++)
        {
            total=(n*(n+1))/2;
        }
        for(int num:nums)
        {
            sum=sum+num;
        }
        int res=total-sum;
        return res;
    }
}
