class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) 
        {
            return false;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
                if(s.indexOf(a)!=t.indexOf(b)) return false;
            
        }
        return true;
    }
}