class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        int[] answer=new int[n];
        for(int i=0;i<nums.length;i++)
        {
            int left=0;
            int right=0;
            for(int j=0;j<i;j++)
            {
                left+=nums[j];
            }
            for(int j=i+1;j<n;j++)
            {
                right+=nums[j];
            }
            leftSum[i]=left;
            rightSum[i]=right;
            answer[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}