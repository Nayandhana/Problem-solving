class Solution {
    public int[] divisibilityArray(String word, int m) {
        int w=word.length();
        long rem=0;
        int[] div=new int[w];
        for(int i=0;i<w;i++){
        int ch=word.charAt(i)-'0';
        rem=(rem*10+ch)%m;
        if(rem==0){
           div[i]=1;
        }
        else{
            div[i]=0;
        }
        }
        return div;
    }
}