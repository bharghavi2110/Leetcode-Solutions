class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            boolean valid=true;
            int num=i;
            while(num>0)
            {
                int digit=num%10;
                if(digit==0 || i%digit!=0)
                {
                    valid=false;
                    break;
                }
                num/=10;
            }
            if(valid)
            {
                list.add(i);
            }
        }
        return list;
    }
}
