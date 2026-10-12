class Solution {
    public int totalMoney(int n) {
        int count=0;
        int sum=0;
        int monday=1;
        for(int i=0;i<n;i++)
        {
            if(i%7==0)
            {
                count=monday;
                monday++;
            }
            else
            {
                count++;
            }
            sum+=count;
        }
        return sum;
    }
}
