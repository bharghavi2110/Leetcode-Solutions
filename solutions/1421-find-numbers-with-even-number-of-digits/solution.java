class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int digit=0;
            while(n>0)
            {
                digit++;
                n/=10;
            }
            if(digit%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
