class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>answers=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),answers);
        return answers;
    }
    private void backtrack(String s,int start,List<String>current,List<List<String>> answers)
    {
        if(start==s.length())
        {
            answers.add(new ArrayList<>(current));
            return;
        }
        for(int end=start;end<s.length();end++)
        {
            String part=s.substring(start,end+1);
            if(isPalindrome(part))
            {
                current.add(part);
                backtrack(s,end+1,current,answers);
                current.remove(current.size()-1);
            }
        }
    }
    private boolean isPalindrome(String part)
    {
        int left=0;
        int right=part.length()-1;
        while(left<right)
        {
            if(part.charAt(left) !=part.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}