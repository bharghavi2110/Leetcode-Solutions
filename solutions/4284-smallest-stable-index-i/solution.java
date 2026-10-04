class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int score=0;
            for(int j=0;j<=i;j++)
            {
                if(nums[j]>max)
                {
                    max=nums[j];
                }
            }
            for(int m=i;m<nums.length;m++)
            {
                if(nums[m]<min)
                {
                    min=nums[m];
                }
            }
            score=max-min;
            if(score<=k)
            {
                return i;
            }
        }
        return -1;
    }
}
