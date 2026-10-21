class Solution {
    public boolean isFascinating(int n) {
        String res="";
        res+=n;
        res+=2*n;
        res+=3*n;
        int[] freq=new int[10];
        for(int i=0;i<res.length();i++)
        {
            int digit=res.charAt(i)-'0';
            freq[digit]++;
        }
        if(freq[0]!=0)
        {
            return false;
        }
        for(int i=1;i<=9;i++)
        {
            if(freq[i]!=1)
            {
                return false;
            }
        }
        return true;
    }
}