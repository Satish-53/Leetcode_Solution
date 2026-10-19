class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())
        {
            return s;
        }
        String[] rows=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]="";
        }
        int row=0;
        boolean goingDown=true;
        for(int i=0;i<s.length();i++)
        {
            rows[row] +=s.charAt(i);
            if(row==numRows-1)
            {
                // reached the bottom
                goingDown=false; 
            }
            else if(row==0)
            {
                // reached the top
                goingDown=true;  
            }
            if(goingDown)
            {
                row++;
            }
            else
            {
                row--;
            }
        }
        String result="";
        for(int i=0;i<numRows;i++)
        {
            result +=rows[i];
        }
        return result;
    }
}