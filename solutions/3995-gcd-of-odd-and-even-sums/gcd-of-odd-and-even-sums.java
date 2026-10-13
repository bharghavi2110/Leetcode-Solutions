class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<=2*n;i+=2)
        {
            sumOdd+=i;
        }
        for(int i=2;i<=2*n;i+=2)
        {
            sumEven+=i;
        }
        int rem=0;
        while(sumEven!=0)
        {
            rem=sumOdd%sumEven;
            sumOdd=sumEven;
            sumEven=rem;
        }
        return sumOdd;
    }
}