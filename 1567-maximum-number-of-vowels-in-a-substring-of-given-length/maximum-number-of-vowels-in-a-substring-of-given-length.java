class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            if(check(s.charAt(i)))
             c++;
        }
        m=c;
        int l=0;
        int r=k-1;
        while(r<s.length()){
            if(check(s.charAt(l)))
             c=c-1;
             l++;
             r++;
             if(r<s.length()){
             if(check(s.charAt(r)))
             c++;
             }
             if(c>m)
             m=c;
        }
        return m;
    }
    public boolean check(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         return true;
        else
         return false;
    }

}