class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count=new int[26];
        // count each letter how much time its repeat
        for (int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        boolean[] used=new boolean[26];
        StringBuilder answer=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            int currentIndex=current-'a';
            // using a single uccurrence for this letter
            count[currentIndex]--;
            //  if letter is already in answer then skip it
            if (used[currentIndex]){
                continue;
            }
            //remove capital letter when its repeat after thenn
            while (answer.length()>0)
            {
                char last=answer.charAt(answer.length()-1);
                int lastIndex=last-'a';
                if (last>current && count[lastIndex]>0)
                {
                    answer.deleteCharAt(answer.length()-1);
                    used[lastIndex]=false;
                }else{
                    break;
                }
            }
            answer.append(current);
            used[currentIndex]=true;
        }
        return answer.toString();
    }
}