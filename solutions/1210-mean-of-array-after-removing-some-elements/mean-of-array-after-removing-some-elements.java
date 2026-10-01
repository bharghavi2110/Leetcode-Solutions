class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length/20;
        int sum=0;
        for(int i=n;i<arr.length-n;i++)
        {
            sum+=arr[i];
        }
        double mean=(double)sum/(arr.length-2*n);
        return mean;
    }
}