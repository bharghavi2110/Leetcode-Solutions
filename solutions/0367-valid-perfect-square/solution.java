class Solution {
    public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num;i++)
        {
            if((long)i*i==num)
            {
                return true;
            }
            if((long)i*i>num)
            {
                return false;
            }
        }
        return false;
    }
}
