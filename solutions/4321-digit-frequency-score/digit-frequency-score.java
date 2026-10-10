class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        int score=0;
        while(n>0)
        {
            int digit=n%10;
            freq[digit]++;
            n/=10;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                score+=i*freq[i];
            }
        }
        return score;
    }
}