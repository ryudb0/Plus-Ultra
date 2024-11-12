import java.util.ArrayDeque;

class Solution
{
    public int solution(String s)
    {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            Integer peek = stack.peek();

            if (peek == null || peek != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}