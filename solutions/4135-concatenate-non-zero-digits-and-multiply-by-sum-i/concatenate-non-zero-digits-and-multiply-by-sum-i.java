class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        String s=String.valueOf(n);
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                res+=s.charAt(i);
            }
        }
        long x=res.isEmpty()?0:Long.parseLong(res);
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return x*sum;
    }
}