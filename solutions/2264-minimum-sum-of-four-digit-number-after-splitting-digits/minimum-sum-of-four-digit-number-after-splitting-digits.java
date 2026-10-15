class Solution {
    public int minimumSum(int num) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int[] digits=new int[4];
        int k=0;
        while(num>0)
        {
            int digit=num%10;
            digits[k++]=digit;
            num/=10;
        }
        Arrays.sort(digits);
        return ((digits[0]*10+digits[2])+(digits[1]*10+digits[3]));
    }
}