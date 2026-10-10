class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box=new int[lowLimit+highLimit];
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int num=i;
            int sum=0;
            while(num>0)
            {
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            box[sum]++;
        }
        int max=box[0];
        for(int i=1;i<box.length;i++)
        {
            if(box[i]>max)
            {
                max=box[i];
            }
        }
        return max;
    }
}