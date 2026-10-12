class Solution {
    public long removeZeros(long n) {
        String s=String.valueOf(n);
        char[] arr=s.toCharArray();
        String result="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='0')
            {
                result+=arr[i];
            }
        }
        return Long.parseLong(result);
    }
}