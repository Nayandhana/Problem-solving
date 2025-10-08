class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> c=new ArrayList<>();
        int m=candies[0];
        for(int i=0;i<candies.length;i++){
            if(m<candies[i]){
                m=candies[i];
            }
        }
            for(int i=0;i<candies.length;i++){
                if((candies[i]+extraCandies)>=m){
                    c.add(true);
                }
                else{
                    c.add(false);
                }
                
              
            }
          return c;
    }
}