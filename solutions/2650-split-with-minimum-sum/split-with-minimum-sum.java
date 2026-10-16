class Solution {
    public int splitNum(int num) {
        int temp=num;
        int digits=0;
        while(temp>0)
        {
            digits++;
            temp/=10;
        }
        int[] arr=new int[digits];
        int k=0;
        int n=num;
        while(n>0)
        {
            int digit=n%10;
            arr[k++]=digit;
            n/=10;
        }
        Arrays.sort(arr);
        int num1=0;
        int num2=0;
        for(int i=0;i<=arr.length-1;i+=2)
        {
            num1=num1*10+arr[i];
        }
        for(int i=1;i<=arr.length-1;i+=2)
        {
            num2=num2*10+arr[i];
        }
        return num1+num2;
    }
}