class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int k=0;
        int i=0;
        int j=n;
        while(i<n)
        {
            arr[k++]=nums[i];
            i++;
            arr[k++]=nums[j];
            j++;
        }
        return arr;
    }
}
