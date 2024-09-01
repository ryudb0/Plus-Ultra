class Solution {
    public boolean solution(String s) {
        String copy = s;
        copy = copy.replaceAll("[^0-9]", "");
        if (s.length() != 4 && 6 != s.length()) {
            return false;
        }
        return copy.length() == s.length();
    }
}