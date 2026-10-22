class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
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
            int encrypt=0;
            for(int j=0;j<count;j++)
            {
                encrypt=encrypt*10+max;
            }
            sum+=encrypt;
        }
        return sum;
    }
}