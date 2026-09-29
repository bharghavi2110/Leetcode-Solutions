class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        while(n>1)
        {
            Arrays.sort(stones,0,n);
            int diff=stones[n-1]-stones[n-2];
            n-=2;
            if(diff!=0)
            {
                stones[n]=diff;
                n++;
            }
        }
        return n==0?0:stones[0];
    }
}
