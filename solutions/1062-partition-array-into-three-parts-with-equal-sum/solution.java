class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int num:arr)
        {
            sum+=num;
        }
        if(sum%3!=0)
        {
            return false;
        }
        int each=sum/3;
        int current=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            current+=arr[i];
            if(current==each)
            {
                count++;
                current=0;
            }
            if(i<arr.length-1 && count==2)
            {
                return true;
            }
        }
        return false;
    }
}
