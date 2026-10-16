class Solution {
    public int splitNum(int num) {
        char[] digits=String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        int num1=0;
        int num2=0;
        for(int i=0;i<=digits.length-1;i+=2)
        {
            num1=num1*10+(digits[i]-'0');
        }
        for(int i=1;i<=digits.length-1;i+=2)
        {
            num2=num2*10+(digits[i]-'0');
        }
        return num1+num2;
    }
}