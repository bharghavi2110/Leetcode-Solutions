class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int n:nums)
        {
            freq[n]++;
        }
        boolean prime=false;
        for(int i=0;i<101;i++)
        {
            if(freq[i]>1)
            {
                prime=true;
                for(int k=2;k<freq[i];k++)
                {
                    if(freq[i]%k==0)
                    {
                        prime=false;
                    }
                }
            }
            if(prime)
            {
                return true;
            }
        }
        return false;
    }
}
