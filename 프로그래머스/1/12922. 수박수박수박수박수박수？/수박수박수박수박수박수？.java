class Solution {
    public String solution(int n) {
        String[] watermelon = {"박", "수"};
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += i % 2 == 1 ? watermelon[1] : watermelon[0];
        }
        return answer;
    }
}