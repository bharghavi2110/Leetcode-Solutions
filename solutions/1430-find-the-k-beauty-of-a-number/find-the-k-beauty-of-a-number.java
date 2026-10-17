class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=String.valueOf(num);
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub=s.substring(i,i+k);
            int divisor=Integer.parseInt(sub);
            if(divisor!=0 && num%divisor==0)
            {
                count++;
            }
        }
        return count;
    }
}