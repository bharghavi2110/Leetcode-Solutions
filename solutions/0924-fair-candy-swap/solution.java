class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicetotal=0;
        int bobtotal=0;
        for(int num:aliceSizes)
        {
            alicetotal+=num;
        }
        for(int num:bobSizes)
        {
            bobtotal+=num;
        }
        int each=(alicetotal+bobtotal)/2;
        for(int i=0;i<aliceSizes.length;i++)
        {
            for(int j=0;j<bobSizes.length;j++)
            {
                if(alicetotal-aliceSizes[i]+bobSizes[j]==each)
                {
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{};
    }
}
