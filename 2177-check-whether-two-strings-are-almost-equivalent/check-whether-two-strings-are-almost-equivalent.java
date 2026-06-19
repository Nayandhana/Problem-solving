class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        //int m=word1.length();
        //int n=word2.length();
        int[] c=new int[26];
        for(int i=0;i<word1.length();i++){
            
                c[word1.charAt(i)-'a']++;
                   
                }
                 for(int i=0;i<word2.length();i++){
            
                c[word2.charAt(i)-'a']--;
                   
                }
                for (int i = 0; i < 26; i++) {
            if (Math.abs(c[i]) > 3) {
                return false; 
            }
        }
           return true; 
        }
        
    }
