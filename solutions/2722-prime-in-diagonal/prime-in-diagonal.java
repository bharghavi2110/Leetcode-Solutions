class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j || i+j==nums.length-1)
                {
                    int prime=nums[i][j];
                    boolean isPrime=true;
                    if(prime<2)
                    {
                        isPrime=false;
                    }
                    for(int k=2;k*k<=prime;k++)
                    {
                        if(prime%k==0)
                        {
                            isPrime=false;
                            break;
                        }
                    }
                    if(isPrime && prime>max)
                    {
                        max=prime;
                    }
                }
            }
        }
        return max;
    }
}