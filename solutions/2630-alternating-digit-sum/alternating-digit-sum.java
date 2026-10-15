class Solution {
    public int alternateDigitSum(int n) {
        int temp=n;
        int digits=0;
        while(temp>0)
        {
            digits++;
            temp/=10;
        }
        int sum=0;
        int sign=(digits%2==0)?-1:1;
        while(n>0)
        {
            int digit=n%10;
            sum+=sign*digit;
            sign=-sign;
            n/=10;
        }
        return sum;
    }
}