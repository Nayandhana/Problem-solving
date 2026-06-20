class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder str=new StringBuilder(s);
        boolean r=true;
        int a=0;
        while(r){
            r=false;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&(j-i)<=k){
                    str.deleteCharAt(j);
                    r=true;
                   i=-1;
                   break;
                }
            }
                    if(r) break;
                }
            }
            
        
        return str.toString();
    }
}