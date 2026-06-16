class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (!s.isEmpty() && k > 0 && s.peek() > num.charAt(i)) {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while (!s.isEmpty() && k > 0) {
            s.pop();
            k--;
        }
        if (s.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
        }
        if (sb.length() == 0) return "0";
        return sb.reverse().toString();
    }
}