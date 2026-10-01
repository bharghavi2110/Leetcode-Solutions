class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] freq=new int[2001];
        for(int num:arr)
        {
            freq[num]++;
        }
        int count=0;
        for(int i=1;i<2001;i++)
        {
            if(freq[i]==0)
            {
                count++;
            }
            if(count==k)
            {
                return i;
            }
        }
        return -1;
    }
}
