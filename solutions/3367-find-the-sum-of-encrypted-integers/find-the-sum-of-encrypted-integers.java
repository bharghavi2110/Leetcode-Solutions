class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int max=-1;
            int count=0;
            while(num>0)
            {
                int digit=num%10;
                if(digit>max)
                {
                    max=digit;
                }
                count++;
                num/=10;
            }
            if(count==2)
            {
                nums[i]=11*max;
            }
            else if(count==3)
            {
                nums[i]=111*max;
            }
            else if(count==4)
            {
                nums[i]=1111*max;
            }
        }
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }
        return sum;
    }
}