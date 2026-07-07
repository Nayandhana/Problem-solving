class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack<>();
       for(String op:operations){
        if(op.equals("+")){
            int top=s.pop();
            int newtop=top+s.peek();
            s.push(top);
            s.push(newtop);
        }
        else if(op.equals("C")){
            s.pop();
        }
        else if(op.equals("D")){
            s.push(2*s.peek());
        }
        else{
            s.push(Integer.valueOf(op));
        }
       } 
       int a=0;
       for(int score:s) a+=score;
       return a;
    }
}