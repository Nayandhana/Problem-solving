class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list=new ArrayList<>();
        for(String s:queries){
            int i=0;
            boolean b=true;
            for(char ch:s.toCharArray()){
                if(i<pattern.length()&&ch==pattern.charAt(i)){
                    i++;
                }
                else if(Character.isUpperCase(ch)){
                    b=false;
                    break;
                }
            }
            list.add(b&&i==pattern.length());
        }
        return list;
    }
}