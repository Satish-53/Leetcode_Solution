class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int a=s.length()-1;
        while(a>=0)
        {
            // Skip spaces between words and at the end.
            while(a>=0 && s.charAt(a)==' ')
            {
                a--;
            }
            if(a<0){
                break;
            }
            // find beginning of this word
            int end=a;
            while(a>=0 && s.charAt(a)!=' ')
            {
                a--;
            }
            int start=a+1;
            // add word to the result
            if(result.length()>0)
            {
                result.append(' ');
            }
            result.append(s,start,end+1);
        }
        return result.toString();
    }
}