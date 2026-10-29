class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] row=new Integer[rowIndex+1];
        // start with the first value.
        row[0]=1;
        for(int i=1;i<=rowIndex;i++)
        {
            // the new last value is always 1.
            row[i] = 1;
            // Fill inner values from right to left.
            for(int j=i-1;j>0;j--)
            {
                row[j]=row[j]+row[j-1];
            }
        }
        return Arrays.asList(row);
    }
}