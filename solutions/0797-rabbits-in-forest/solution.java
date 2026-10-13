class Solution {
    public int numRabbits(int[] answers) {
        int count=0;
        int[] freq=new int[1001];
        for(int n:answers)
        {
            freq[n]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                count+=((freq[i]+i)/(i+1))*(i+1);
            }
        }
        return count;
    }
}
