class Solution {
    public String solution(String s) {
        int index = s.length() / 2;
        if (s.length() % 2 == 0) {
            String s1 = String.valueOf(s.charAt(index - 1));
            String s2 = String.valueOf(s.charAt(index));
            return s1 + s2;
        }
        return String.valueOf(s.charAt(index));
    }
}