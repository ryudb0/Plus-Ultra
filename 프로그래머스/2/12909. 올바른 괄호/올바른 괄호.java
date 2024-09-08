class Solution {
    boolean solution(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sum < 0) {
                return false;
            }
            char ch = s.charAt(i);
            if (ch == '(') {
                sum++;
                continue;
            }
            sum--;
        }
        return sum == 0;
    }
}