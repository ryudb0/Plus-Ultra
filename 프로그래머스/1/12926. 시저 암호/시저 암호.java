class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                answer += " ";
                continue;
            }

            int standard = Character.isUpperCase(ch) ? 65 : 97;
            int gap = (ch - standard + n) % 26;
            answer += (char) (standard + gap);

        }
        return answer;
    }

}