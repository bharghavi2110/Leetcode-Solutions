class Solution {
    public int maxProduct(int n) {
        int[] arr=new int[11];
        int k=0;
        while(n>0)
        {
            int digit=n%10;
            arr[k++]=digit;
            n/=10;
        }
        Arrays.sort(arr,0,k);
        return arr[k-1]*arr[k-2];
    }
}