class Solution {
    public int minDeletions(String s) {
        int n=s.length();
        int f[]=new int [26];
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
        }
        Set<Integer> a=new HashSet<>();
        int del=0;
        for(int fre:f){
            while(fre>0&&a.contains(fre)){
                fre--;
                del++;
            }
            if(fre>0){
                a.add(fre);
            }
        }
        return del;

    }
}