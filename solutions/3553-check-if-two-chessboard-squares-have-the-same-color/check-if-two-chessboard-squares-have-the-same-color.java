class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int letter1=coordinate1.charAt(0)-'a'+1;
        int number1=coordinate1.charAt(1);
        int letter2=coordinate2.charAt(0)-'a'+1;
        int number2=coordinate2.charAt(1);
        if(((letter1+number1)%2==0 && (letter2+number2)%2==0) || ((letter1+number1)%2!=0 && (letter2+number2)%2!=0))
        {
            return true;
        }
        return false;
    }
}