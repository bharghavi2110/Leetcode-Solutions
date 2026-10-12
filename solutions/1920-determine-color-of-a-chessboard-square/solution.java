class Solution {
    public boolean squareIsWhite(String coordinates) {
        int letter=coordinates.charAt(0)-'a'+1;
        int number=coordinates.charAt(1);
        if((letter+number)%2==0)
        {
            return false;
        }
        return true;
    }
}
