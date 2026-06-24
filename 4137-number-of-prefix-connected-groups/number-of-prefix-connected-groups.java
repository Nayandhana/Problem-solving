class Solution {
    public int prefixConnected(String[] words, int k) {
       int count=0;
       Map<String, Integer> m = new HashMap<>();
       for(int i=0;i<words.length;i++){
        if(words[i].length()>=k){
        String s=words[i].substring(0,k);
        m.put(s,m.getOrDefault(s,0)+1);
        if(m.get(s)==2) count++;
        }
       }
       return count;
    }
}