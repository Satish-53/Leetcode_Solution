class Solution{
    public boolean isAnagram(String s,String t){
        if (s.length() !=t.length())
        return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a,b);
    }
}