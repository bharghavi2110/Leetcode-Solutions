class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] result=new int[nums.length];
        int j=0;
        int k=0;
        arr1[j++]=nums[0];
        arr2[k++]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            if(arr1[j-1]>arr2[k-1])
            {
                arr1[j++]=nums[i];
            }
            else
            {
                arr2[k++]=nums[i];
            }
        }
        int index=0;
        for(int i=0;i<j;i++)
        {
            result[index++]=arr1[i];
        }
        for(int i=0;i<k;i++)
        {
            result[index++]=arr2[i];
        }
        return result;
    }
}
