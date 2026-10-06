class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int k=index[i];
            for(int j=nums.length-1;j>k;j--)
            {
                target[j]=target[j-1];
            }
            target[k]=nums[i];
        }
        return target;
    }
}