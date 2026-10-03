class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int maxrange=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(n>0)
            {
                int digit=n%10;
                if(digit>max)
                {
                    max=digit;
                }
                if(digit<min)
                {
                    min=digit;
                }
                n/=10;
            }
            int range=max-min;
            if(range>maxrange)
            {
                maxrange=range;
                sum=nums[i];
            }
            else if(range==maxrange)
            {
                sum+=nums[i];
            }
        }
        return sum;
    }
}